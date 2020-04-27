package com.lgh.controller;

import com.lgh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    /**
     * 组长写了一个bug
     */
    @RequestMapping("/testAdd")
    public void testAdd(){

    }
}
