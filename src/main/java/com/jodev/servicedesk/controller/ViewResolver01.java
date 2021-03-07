package com.jodev.servicedesk.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

public class ViewResolver01 extends InternalResourceViewResolver{

//	@Value("classpath:view-prefix")
	@Value("/WEB-INF/views/")
	private String prefix;
	
//	@Value("classpath:view-sufix") the bean is not loaded by the container yet
	@Value(".jsp")
	private String suffix;
	
	//Used by IOC to inject the values from the .properties file
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	//Used by IOC to inject the values from the .properties file
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	@Override
	public String getPrefix() {
		return this.prefix;
	}
	
	@Override
	public String getSuffix() {
		return this.suffix;
	}

}
