package com.zhita.service.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhita.dao.manage.TestMapper;





@Service
public class TestServiceImp implements TestService{
	@Autowired
	TestMapper testMapper;

	@Override
	public int settest(String name) {
		int number = testMapper.settest(name); 
		return number;
	}

	@Override
	public String gettest(int id) {
		String name = testMapper.gettest(id);
		return name;
	}

}
