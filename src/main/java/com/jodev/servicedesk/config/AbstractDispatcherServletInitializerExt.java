package com.jodev.servicedesk.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//In this class we will configure the all the application context and configuration classes
public class AbstractDispatcherServletInitializerExt extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		LogNdc.log();

		// First instantiating the context by hand
		AnnotationConfigWebApplicationContext localDispatcherServletContext = new AnnotationConfigWebApplicationContext();

		// Register the @configuration class that substitutes XML and configures the IOC
		localDispatcherServletContext.register(WebConfig.class);

//		for the automatically created DispatcherServlet local IOC
		return localDispatcherServletContext;
	}

	@Override
	protected String[] getServletMappings() {
		// The mapping for the automatically created DispatcherServlet
		return new String[] { "/a/*" };// should use * here
	}

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		LogNdc.log();
		/*Returns null because we already created the root application context extending an abstract class
		 * AbstractContextLoaderInitializer 
		*/
		return null;
	}

	// Override the default name because we have two DispatcherServlet created
	// automatically
	@Override
	protected String getServletName() {
		return "Dispatcher01";
	}
}