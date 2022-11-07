package com.mustache.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller //컨트롤러 선언
public class MustacheController {

    //"/hi" endpoint 매핑
    @GetMapping(value = "/hi")
    public String mustacheCon(Model model) {
        model.addAttribute("username", "rok");
        //view에 username 값인 rok를 넘기겠다는 것
        return "Greetings";
        // Greetings라는 이름의 view를 리턴
    }

    //"/hi" endpoint 매핑
    @GetMapping(value = "/hi/{id}")
    public String mustacheCon(@PathVariable String id, Model model) {
        model.addAttribute("username", "rok");
        model.addAttribute("id", id);
        //view에 username 값인 rok를 넘기겠다는 것
        return "Greetings";
        // Greetings라는 이름의 view를 리턴
    }
}
