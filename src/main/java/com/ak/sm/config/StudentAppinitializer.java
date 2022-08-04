package com.ak.sm.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppinitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configFiles = {StudentConfig.class};
		return configFiles;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping= {"/"};
		return mapping;
	}

}
