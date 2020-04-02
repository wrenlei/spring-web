package com.ax.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Test2 {
	
	private String id;
	private String name;
	private int age;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
}
