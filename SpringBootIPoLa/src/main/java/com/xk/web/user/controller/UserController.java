package com.xk.web.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xk.util.base.BaseModel;
import com.xk.web.user.model.UserBean;
import com.xk.web.user.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/insert")
	public BaseModel insert(UserBean userBean) {
		return userService.insert(userBean);
	}

}
