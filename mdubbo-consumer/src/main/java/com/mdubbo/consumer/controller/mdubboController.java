package com.mdubbo.consumer.controller;

import com.mdubbo.registry.service.registryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Author 阁楼麻雀
 * @Date 2016-7-28
 * @Desc
 */
@Controller
@RequestMapping("/consumer")
public class mdubboController {
    @Autowired
    private registryService registryService;

    @RequestMapping("/hello")
    public String index(Model model){
        String message=registryService.Hello("mdubbo");
        System.out.println(message);
        return "";
    }

}
