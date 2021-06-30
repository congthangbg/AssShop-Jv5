package com.vn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.vn.Intercepter.AdminAuthenticationIntercepter;
import com.vn.Intercepter.SiteAuthenticationIntercepter;

@Configuration
public class AuthenticationIntercepterConfig implements WebMvcConfigurer{

	@Autowired
	private AdminAuthenticationIntercepter adminAuthenticationIntercepter;
	
	@Autowired
	private SiteAuthenticationIntercepter siteAuthenticationIntercepter;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(adminAuthenticationIntercepter)
				.addPathPatterns("/admin/**");
		
		registry.addInterceptor((HandlerInterceptor) siteAuthenticationIntercepter)
				.addPathPatterns("/site/**");
	}

	
}
