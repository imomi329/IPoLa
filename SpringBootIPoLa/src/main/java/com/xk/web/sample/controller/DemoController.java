package com.xk.web.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xk.web.sample.model.Demo;
import com.xk.web.sample.service.DemoService;

@RestController
@RequestMapping("/Demo")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping("/sql")
	public String sample() {
		String html = "<h1>Demo SQL</h1><br>"
				+ "<h2>insert、update、delete、select</h2><br>"
				+ "<a href=\"http://localhost:8001/Demo/insert?name=apple\">http://localhost:8001/Demo/insert?name=apple</a><br>"
				+ "<a href=\"http://localhost:8001/Demo/update?id=7&name=orange\">http://localhost:8001/Demo/update?id=7&name=orange</a><br>"
				+ "<a href=\"http://localhost:8001/Demo/update?id=7&name=apple\">http://localhost:8001/Demo/update?id=7&name=apple</a><br>"
				+ "<a href=\"http://localhost:8001/Demo/delete?id=7\">http://localhost:8001/Demo/delete?id=7</a><br>"
				+ "<a href=\"http://localhost:8001/Demo/delete?id=7&status=0\">http://localhost:8001/Demo/delete?id=7&status=0</a><br>"
				+ "<a href=\"http://localhost:8001/Demo/select\">http://localhost:8001/Demo/select</a><br>"
				+ "<a href=\"http://localhost:8001/Demo/selectById?id=7\">http://localhost:8001/Demo/selectById?id=7</a><br>"
				+ "";
		return html;
	}

	@RequestMapping("/insert")
	public void insert(String name) {
		Demo demo = new Demo();
		demo.setAccount("test");
		demo.setPassword("123456");
		demo.setName(name);
		demo.setStatus(1);
		demoService.insert(demo);
	}

	// default update by id(key), can update account, password, name, status
	@RequestMapping("/update")
	public void update(Demo demo) {
		demoService.update(demo);
	}

	// 通常不使用 delete 若有非需要資料，請在 DB 增加 status 欄位，並關閉該筆資料
	// 這樣的做法，減少資料遺失，並且有原始資料可以回追問題

	// default delete by id(key)
	@RequestMapping("/delete")
	public void delete(Demo demo) {
		if (demo.getStatus() == null || demo.getStatus() == 1) {
			demo.setStatus(0);
		} else {
			demo.setStatus(1);
		}
		// 故這邊的 SQL 語法，並非 DELETE FROM DEMO WHERE ID = 1;
		// 而是， UPDATE DEMO SET STATUS = 0 WHERE ID = 1;
		demoService.delete(demo);
	}

	@RequestMapping("/select")
	public List<Demo> selectAll() {
		return demoService.select();
	}
	
	@RequestMapping("/selectById")
	public Demo selectById(Integer id) {
		return demoService.selectById(id);
	}

}
