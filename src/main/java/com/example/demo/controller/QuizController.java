package com.example.demo.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz")
public class QuizController {

	@GetMapping("/q1")
    public void ex1(Model model){
        // model: 뷰에 데이터를 전달하는 객체
        // addAttribute: 모델에 데이터를 담는 함수

        model.addAttribute("name", "둘리");
        model.addAttribute("age", "20");
        model.addAttribute("address", "인천 구월동");
    }

    @GetMapping("/q2")
    public void ex2(Model model){
        model.addAttribute("title", "스프링부트웹프로젝트");
        model.addAttribute("author", "구멍가게코딩단");
        model.addAttribute("publicationDate", LocalDate.of(2022,12,25));
    }
	
}
