package com.ax.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ax.dao.Test2Dao;
import com.ax.entity.Test2;
import com.ax.service.ITest2Service;

@Service
public class Test2ServiceImpl implements ITest2Service{
	
	@Autowired
	private Test2Dao test2Dao;

	@Override
	public void save() {
		test2Dao.save();
	}

	@Override
	public void del() {
		test2Dao.del();
	}

	@Override
	public Test2 getById(String id) {
		return test2Dao.getById(id);
	}

	@Override
	public List<Test2> getList() {
		return test2Dao.getList();
	}

	@Override
	public void update() {
		test2Dao.update();
	}
}
