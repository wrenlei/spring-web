package com.core.exception;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CustomExceptionHandler implements HandlerExceptionResolver{

	@Override  
    public ModelAndView resolveException(HttpServletRequest request,  
            HttpServletResponse response, Object object, Exception exception) {
		
    	request.setAttribute("ex",exception);
        if(exception instanceof IOException){
            return new ModelAndView("page/error/ioexp2");  
        }else if(exception instanceof SQLException){  
            return new ModelAndView("page/error/sqlexp2");  
        }
        return new ModelAndView("page/error/defaultError2"); 
    }  
}
