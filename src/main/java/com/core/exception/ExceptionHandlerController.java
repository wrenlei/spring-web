package com.core.exception;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Controller
@RequestMapping("/test")
public class ExceptionHandlerController {
	
	@ExceptionHandler(value={Exception.class})  
    public String exp3(Exception ex,HttpServletRequest request) {  
        request.setAttribute("ex", ex);  
        return "page/error/defaultError3";  
    }

	@ExceptionHandler(value={IOException.class})  
    public String exp(Exception ex,HttpServletRequest request) {  
        request.setAttribute("ex", ex);  
        return "page/error/ioexp3";  
    }
	
	@ExceptionHandler(value={SQLException.class})  
    public String exp2(Exception ex,HttpServletRequest request) {  
        request.setAttribute("ex", ex);  
        return "page/error/sqlexp3";   
    } 
	
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
