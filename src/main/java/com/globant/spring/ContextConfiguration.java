package com.globant.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityViewResolver;

@Configuration
public class ContextConfiguration {	
		
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ContextConfiguration.class);		
		ctx.scan("com.globant");
		ctx.refresh();
	}
	
	@Bean
	public VelocityConfigurer velocityConfig() {
		VelocityConfigurer vc = new VelocityConfigurer();
		vc.setResourceLoaderPath("/WEB-INF/velocity/");
		return vc;
	}

	@Bean
	public ViewResolver viewResolver() {
		VelocityViewResolver vr = new VelocityViewResolver();
		vr.setCache(true);
		vr.setPrefix("");
		vr.setSuffix(".html");
		vr.setExposeSpringMacroHelpers(true);
		return vr;
	}
}
