package com.jodev.servicedesk.config;

import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.jodev.servicedesk.service.Service01;

//Class for create a root application context since the AbstractDispatcherServletInitializerExts will return null
public class AbstractContextLoaderInitializerExt extends AbstractContextLoaderInitializer{

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();
		
		//Registering the shared service
		root.register(Service01.class);
		root.refresh();
		return root;
	}
	
}
