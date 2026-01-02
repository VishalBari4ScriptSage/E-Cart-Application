package com.VishalBari4ScriptSage.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String indexPage(Model model){
        model.addAttribute("name","Vishal");
        return "index";
    }

}
