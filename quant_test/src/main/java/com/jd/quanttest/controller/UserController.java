package com.jd.quanttest.controller;

import com.jd.quanttest.model.User;
import com.jd.quanttest.service.Userservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by sunminying1 on 2017/5/15.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private Userservice userservice;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userservice.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}