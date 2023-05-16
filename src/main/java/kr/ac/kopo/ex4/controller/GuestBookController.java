package kr.ac.kopo.ex4.controller;


import kr.ac.kopo.ex4.dto.PageRequestDTO;
import kr.ac.kopo.ex4.service.GuestbookService;
import lombok.RequiredArgsConstructor;
import  lombok.extern.log4j.Log4j2;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/questbook")
@Log4j2
@RequiredArgsConstructor
public class GuestBookController {
    private final GuestbookService service;
    @GetMapping("/")
    public String index(){
        return "redirect:/questbook/list";
    }
    @GetMapping({"/list"})
    public void list(PageRequestDTO pageRequestDTO, Model model){
        log.info("페이지 요청 정보: " + pageRequestDTO);
        model.addAttribute("result", service.getList(pageRequestDTO));
    }
}
