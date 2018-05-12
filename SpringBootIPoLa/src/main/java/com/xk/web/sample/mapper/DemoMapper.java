package com.xk.web.sample.mapper;

import java.util.List;

import com.xk.web.sample.model.Demo;

public interface DemoMapper {

	// @Insert("insert into demo (name) values (#{name})")
	// @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id") //
	// 主鍵自增長
	public void insert(Demo demo);

	public void update(Demo demo);

	public void delete(Demo demo);

	public List<Demo> select();

	public Demo selectById(Integer id);

}
