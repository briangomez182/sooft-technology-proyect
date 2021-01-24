package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class DemoController {
	
	@GetMapping("/")
    public String index(){
        return "index";
    }
	
	@GetMapping("/nuevoComentario")
    public String nuevoComentario(){
        return "formComentario";
    }
}
