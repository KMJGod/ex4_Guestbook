package kr.ac.kopo.ex4.controller;

import  lombok.extern.log4j.Log4j2;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/questbook")
@Log4j2
public class GuestBookController {
    @GetMapping({"/","/list"})
    public String list(){
        log.info("방명록 목록 화면");
        return "/guestbook/list";
    }
}
