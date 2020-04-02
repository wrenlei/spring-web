package com.sl.service;

import java.util.List;

import com.sl.entity.Test;

public interface ITestService {

	 void save();
	 void del();
	 Test getById(String id);
	 List<Test> getList();
	 void update();
}
