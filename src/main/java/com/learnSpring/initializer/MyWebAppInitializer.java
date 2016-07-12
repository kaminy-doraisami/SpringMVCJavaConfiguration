package com.learnSpring.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.learnSpring.configurer.*;

public class MyWebAppInitializer implements WebApplicationInitializer {
	
	@Override
    public void onStartup(ServletContext container)throws ServletException {
/*
      // Create the root application context
      AnnotationConfigWebApplicationContext rootContext =
        new AnnotationConfigWebApplicationContext();
      rootContext.setDisplayName("My Web API app context");
      rootContext.register(RootConfig.class);
      */
      
      // Manage the lifecycle of the root application context 
  //    container.addListener(new ContextLoaderListener(rootContext));
      
      // Create the dispatcher servlet's Spring application context
      AnnotationConfigWebApplicationContext dispatcherContext =
        new AnnotationConfigWebApplicationContext();
      dispatcherContext.register(DispatcherConfig.class);


      // Register and map the dispatcher servlet
      ServletRegistration.Dynamic dispatcher =
        container.addServlet("my-dispatcher", new DispatcherServlet(dispatcherContext));
      dispatcher.setLoadOnStartup(1);
      dispatcher.addMapping("/");
    }

 }

