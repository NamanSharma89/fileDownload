package com.fd.ap.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DbReportInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { DbReportConfiguration.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
 }