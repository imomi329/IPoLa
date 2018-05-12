package com.xk.web.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xk.web.sample.mapper.DemoMapper;
import com.xk.web.sample.model.Demo;

@Service
public class DemoService {

	@Autowired
	private DemoMapper demoMapper;

	@Transactional // 添加事務
	public void insert(Demo demo) {
		demoMapper.insert(demo);
	}

	public void update(Demo demo) {
		demoMapper.update(demo);
	}

	public void delete(Demo demo) {
		demoMapper.delete(demo);
	}

	public List<Demo> select() {
		return demoMapper.select();
	}
	
	public Demo selectById(Integer id) {
		return demoMapper.selectById(id);
	}

}
