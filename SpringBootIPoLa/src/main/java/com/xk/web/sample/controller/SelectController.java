package com.xk.web.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.xk.web.sample.model.Demo;
import com.xk.web.sample.service.SelectService;

@RestController
@RequestMapping("/Select")
public class SelectController {
	
	@Autowired
	private SelectService selectService;

	@RequestMapping("/likeName")
	public List<Demo> likeName(String name) {
		/*
		 * 參數一：頁數
		 * 參數二：每頁筆數
		 */
		PageHelper.startPage(1,2);
		return selectService.likeName(name);
	}

	@RequestMapping("/getById")
	public Demo getById(long id) {
		return selectService.getById(id);
	}

	@RequestMapping("/getNameById")
	public String getNameById(long id) {
		return selectService.getNameById(id);
	}
	
}
