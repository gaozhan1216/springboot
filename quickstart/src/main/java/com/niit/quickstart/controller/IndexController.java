package com.niit.quickstart.controller;


import com.niit.quickstart.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class IndexController {

    //注入了一个Student类的对象，被Spring容器托管——bean
    @Resource
    private Student student;

    //    @RequestMapping(value = "/index",method = RequestMethod.GET)
    @GetMapping("index")
 public String index(ModelMap map) {
         student.setName("Tom");
         student.setAge(20);
         student.setMale("男");
         //将模型加入视图
         map.addAttribute("student",student);
         return "index";
         }

}