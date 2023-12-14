package com.example.Library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.util.Date;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/")
    public  String home(Model model){
        model.addAttribute("today", new Date());
        return "index.html";
    }
}
