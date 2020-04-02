package com.ax.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ax.entity.Test2;
import com.ax.service.ITest2Service;

@Controller
@RequestMapping("/test2")
public class Test2Controller {
	
	public static Logger logger=Logger.getLogger(Test2Controller.class);
	
	@Autowired
	private ITest2Service test2Service;
	
	@RequestMapping("/get")
	@ResponseBody
	public Test2 get() {
		return test2Service.getById("1");
	}
	
	@RequestMapping("/getString")
	@ResponseBody
	public String getString() {
		return "asdfg";
	}
	
	@RequestMapping("/getList")
	@ResponseBody
	public List<Test2> getList() {
		return test2Service.getList();
	}
}
