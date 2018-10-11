package com.example.demo.controller;

import com.example.demo.service.SporterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by 高展 on 2018/10/11.
 */
@Controller
@RequestMapping(value = "/sporter")
public class SporterController {

    @Resource
    private SporterService sporterService;


    /**
     * 登陆
     * @return
     */
    @GetMapping()
    public String  test(){
        return "login";
    }


    /**
     * 查看详情
     * @param account
     * @param password
     * @param map
     * @return
     */
    @GetMapping(value = "/list")
    public String list(
            @RequestParam("account") String account,
            @RequestParam("password") String password,
            ModelMap map){
        map.addAttribute("person",sporterService.login(account,password));
        map.addAttribute("list",sporterService.findAll());
        return "list";
    }
}

