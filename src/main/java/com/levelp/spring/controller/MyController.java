package com.levelp.spring.controller;


import com.levelp.spring.model.Consumer;
import com.levelp.spring.service.consumer.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    ConsumerService service;

    @RequestMapping(value = "/hello")
    public String hello(ModelMap map){
        return "index";
    }

    @RequestMapping(value = "/get")
    public List<Consumer> get(ModelMap map){

        return service.list();
    }
}
