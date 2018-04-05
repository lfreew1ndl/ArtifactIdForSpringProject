package com.levelp.spring.controller;


import com.levelp.spring.model.Consumer;
import com.levelp.spring.service.atc.AtcService;
import com.levelp.spring.service.calls.CallsService;
import com.levelp.spring.service.city.CityService;
import com.levelp.spring.service.consumer.ConsumerService;
import com.levelp.spring.service.mtc.MtcService;
import com.levelp.spring.service.number.NumberService;
import com.levelp.spring.service.payphones.PayphonesService;
import com.levelp.spring.service.phone.PhoneService;
import com.levelp.spring.service.phonenumber.PhonenumberService;
import com.levelp.spring.service.queue.QueueService;
import com.levelp.spring.service.region.RegionService;
import com.levelp.spring.service.street.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    ConsumerService consumerService;

    @Autowired
    AtcService atcService;

    @Autowired
    CallsService callsService;

    @Autowired
    CityService cityService;

    @Autowired
    MtcService mtcService;

    @Autowired
    NumberService numberService;

    @Autowired
    PayphonesService payphonesService;

    @Autowired
    PhoneService phoneService;

    @Autowired
    PhonenumberService phonenumberService;

    @Autowired
    QueueService queueService;

    @Autowired
    RegionService regionService;

    @Autowired
    StreetService streetService;


    @RequestMapping(value = "/hello")
    public String hello(ModelMap map){
        map.addAttribute(consumerService.list());
        map.addAttribute(atcService.list());
        map.addAttribute(callsService.list());
        map.addAttribute(cityService.list());
        map.addAttribute(mtcService.list());
        map.addAttribute(numberService.list());
        map.addAttribute(payphonesService.list());
        map.addAttribute(phoneService.list());
        map.addAttribute(phonenumberService.list());
        map.addAttribute(queueService.list());
        map.addAttribute(regionService.list());
        map.addAttribute(streetService.list());
        return "index";
    }

}
