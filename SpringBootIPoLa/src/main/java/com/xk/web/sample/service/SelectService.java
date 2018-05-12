package com.xk.web.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xk.web.sample.mapper.SelectMapper;
import com.xk.web.sample.model.Demo;

@Service
public class SelectService {

	@Autowired
	private SelectMapper selectMapper;

	public List<Demo> likeName(String name) {
		return selectMapper.likeName(name);
	}

	public Demo getById(long id) {
		return selectMapper.getById(id);
	}

	public String getNameById(long id) {
		return selectMapper.getNameById(id);
	}
	
	@Transactional // 添加事務
	public void save(Demo demo) {
		selectMapper.save(demo);
	}
	
}
