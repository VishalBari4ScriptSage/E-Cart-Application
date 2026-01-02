package com.VishalBari4ScriptSage.store.controller;

import com.VishalBari4ScriptSage.store.entities.Massage;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MassageController {

    @RequestMapping("/massage")
    public Massage getMassage(){
        return new Massage("Hello Vishal, Welcome to API");
    }
}
