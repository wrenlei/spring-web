package com.sl.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sl.entity.Test;

@Repository
public class TestDao {

	public void save() {
		
	}
	
	public void del() {
		
	}
	
	public Test getById(String id) {
		Test test =new Test();
		test.setId("1");
		test.setName("哈哈");
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
	
	public List<Test> getList(){
		List<Test> list = new ArrayList<Test>();
		
		Test test =new Test();
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
		
		Test test2 =new Test();
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
