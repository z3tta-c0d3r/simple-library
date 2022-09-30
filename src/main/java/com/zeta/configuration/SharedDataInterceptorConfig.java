package com.zeta.configuration;


import com.zeta.SharedDataInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SharedDataInterceptorConfig implements WebMvcConfigurer {

	@Autowired
	private SharedDataInterceptor sharedDataInterceptor;

	public SharedDataInterceptorConfig(SharedDataInterceptor sharedDataInterceptor) {
		this.sharedDataInterceptor = sharedDataInterceptor;
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(sharedDataInterceptor).order(Ordered.HIGHEST_PRECEDENCE);
	}
	
	

}