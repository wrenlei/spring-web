package com.sl.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor2 extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
							 Object handler) throws Exception {
		System.out.println("action之前执行2");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response,
						   Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("action之后，生成视图之前执行2");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
								Object handler, Exception ex) throws Exception {
		System.out.println("最后执行，释放资源，处理异常2");
	}
}
