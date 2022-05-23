package com.example.votacoes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class SiteController {

    @GetMapping
    public String homeView(){
        return "index.html";
    }
}
