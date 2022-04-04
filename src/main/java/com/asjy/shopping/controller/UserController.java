package com.asjy.shopping.controller;


import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asjy.shopping.service.IUserService;
import com.asjy.shopping.util.ValidateCode;
import com.asjy.shopping.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	IUserService userService;
	
	
}
