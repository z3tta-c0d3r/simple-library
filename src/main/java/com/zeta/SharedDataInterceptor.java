package com.zeta;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SharedDataInterceptor implements HandlerInterceptor {

	private SharedData sharedData;

	public SharedDataInterceptor(SharedData sharedData) {
		this.sharedData = sharedData;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		sharedData.clear();
		return true;
	}
}
