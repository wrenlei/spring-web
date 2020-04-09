package com.sl.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sl.entity.Test;
import com.sl.service.ITestService;

@Controller
@RequestMapping("/test")
public class TestController {
	
	public static Logger logger=Logger.getLogger(TestController.class);
	
	@Autowired
	private ITestService testService;
	
	/**
	 * 页面传的字符串类型的日期，在Controller中可以用Date类型接收
	 * @param binder
	 */
	@InitBinder  
	public void initBinder(WebDataBinder binder) {  
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
		dateFormat.setLenient(false);  
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));//true:允许输入空值，false:不能为空值
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public Test get() {
		return testService.getById("1");
	}
	
	@RequestMapping("/getString")
	@ResponseBody
	public String getString() {
		return "asdfg";
	}
	
	@RequestMapping("/getList")
	@ResponseBody
	public List<Test> getList() {
		return testService.getList();
	}
	
	@RequestMapping("/showInput")
	public String showInput() {
		return "page/input";
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public void save(Test test) {
		logger.info("id:"+test.getId());
		logger.info("name:"+test.getName());
		logger.info("age:"+test.getAge());
		logger.info("birthday:"+test.getBirthday());
		logger.info("doc:"+test.getDoc().getOriginalFilename());
	}
	
	@RequestMapping("/showDetail")
	public String showDetail(Model model) {
		Test test = testService.getById("1");
		model.addAttribute("test",test);
		return "page/detail";
	}
}
