package com.sl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sl.dao.TestDao;
import com.sl.entity.Test;
import com.sl.service.ITestService;

@Service
public class TestServiceImpl implements ITestService{

	@Autowired
	private TestDao testDao;

	@Override
	public void save() {
		testDao.save();
	}

	@Override
	public void del() {
		testDao.del();
	}

	@Override
	public Test getById(String id) {
		return testDao.getById(id);
	}

	@Override
	public List<Test> getList() {
		return testDao.getList();
	}

	@Override
	public void update() {
		testDao.update();
	}
	
}
