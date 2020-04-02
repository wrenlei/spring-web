package com.ax.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ax.entity.Test2;

@Repository
public class Test2Dao {

public void save() {
		
	}
	
	public void del() {
		
	}
	
	public Test2 getById(String id) {
		Test2 test =new Test2();
		test.setId("1");
		test.setName("sl");
		test.setAge(20);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = sf.parse("2010-11-11");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		test.setBirthday(birthday);
		
		return test;
	}
	
	public List<Test2> getList(){
		List<Test2> list = new ArrayList<Test2>();
		
		Test2 test =new Test2();
		test.setId("1");
		test.setName("sl");
		test.setAge(20);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = sf.parse("2010-11-11");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		test.setBirthday(birthday);
		list.add(test);
		
		Test2 test2 =new Test2();
		test2.setId("1");
		test2.setName("你好");
		test2.setAge(20);
		
		try {
			birthday = sf.parse("2010-11-12");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		test2.setBirthday(birthday);
		list.add(test2);
		
		return list;
	}
	
	public void update() {
		
	}
}
