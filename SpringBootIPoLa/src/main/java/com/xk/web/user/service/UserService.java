package com.xk.web.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xk.util.base.BaseModel;
import com.xk.web.user.mapper.UserMapper;
import com.xk.web.user.model.UserBean;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;

	public BaseModel insert(UserBean userBean) {
		BaseModel bm = new BaseModel();
		
		try {
			int i = userMapper.insert(userBean);
			
			bm.setData(i);
			bm.setCode("1");
			bm.setSuccess(true);
		} catch (Exception e) {
			e.printStackTrace();
			bm.setCode("0");
			bm.setSuccess(false);
		}
		return bm;
	}
}
