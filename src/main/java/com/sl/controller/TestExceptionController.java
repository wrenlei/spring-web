package com.sl.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/testException")
public class TestExceptionController {
	
	public static Logger logger=Logger.getLogger(TestExceptionController.class);
	
	@RequestMapping("/iOException")
	@ResponseBody
	public void getException1() throws IOException {
		throw new IOException("测试抛出io异常"); 
	}
	
	@RequestMapping("/sQLException")
	@ResponseBody
	public void getException2() throws SQLException{
		throw new SQLException("测试抛出sql异常");
	}
	
	@RequestMapping("/runtimeException")
	@ResponseBody
	public void getRuntimeException(){
		throw new RuntimeException("测试抛出runtimeException异常");
	}
	
	@RequestMapping("/classNotFoundException")
	@ResponseBody
	public void getClassNotFoundException(){
		try {
			throw new ClassNotFoundException("测试捕获classNotFoundException异常");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
