package com.ax.service;

import java.util.List;

import com.ax.entity.Test2;

public interface ITest2Service {
	
	 void save();
	 void del();
	 Test2 getById(String id);
	 List<Test2> getList();
	 void update();
}
