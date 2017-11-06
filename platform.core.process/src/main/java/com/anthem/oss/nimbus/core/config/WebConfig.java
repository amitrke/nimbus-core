package com.anthem.oss.nimbus.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Configures classloader to load resources from custom locations
 * 
 * @author Rohit Bajaj
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("forward:/index.html");
		registry.addViewController("/ui/").setViewName("forward:/index.html");
	}
	
    // The second argument of addResourceLocations is to tell where to look in a jar file.
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		if (!registry.hasMappingForPattern("/index.html")) {
			registry.addResourceHandler("/index.html").addResourceLocations("file:./target/frontend/index.html", "classpath:/static/");
		}
		if (!registry.hasMappingForPattern("/systemjs*")) {
			registry.addResourceHandler("/systemjs*").addResourceLocations("file:./target/frontend/", "classpath:/static/");
		}
		if (!registry.hasMappingForPattern("/scripts/**")) {
			registry.addResourceHandler("/scripts/**").addResourceLocations("file:./target/frontend/scripts/", "classpath:/static/scripts/");
		}
		if (!registry.hasMappingForPattern("/styles/**")) {
			registry.addResourceHandler("/styles/**").addResourceLocations("file:./target/frontend/styles/", "classpath:/static/styles/");
		}
		if (!registry.hasMappingForPattern("/js/**")) {
			registry.addResourceHandler("/js/**").addResourceLocations("file:./target/frontend/js/", "classpath:/static/js/");
		}
		if (!registry.hasMappingForPattern("/node_modules/**")) {
			registry.addResourceHandler("/node_modules/**")
					.addResourceLocations("file:./target/frontend/node_modules/", "classpath:/static/node_modules/");
		}
		if (!registry.hasMappingForPattern("/utils/**")) {
			registry.addResourceHandler("/utils/**").addResourceLocations("file:./target/frontend/utils/", "classpath:/static/utils/" );
		}
		if (!registry.hasMappingForPattern("/webapp/**")) {
			registry.addResourceHandler("/webapp/**").addResourceLocations("file:./target/frontend/webapp/", "classpath:/static/webapp/");
		}
		if (!registry.hasMappingForPattern("/resources/**")) {
			registry.addResourceHandler("/resources/**").addResourceLocations("classpath:./static/");
		}
		if (!registry.hasMappingForPattern("/vendor**bundle*js")) {
			registry.addResourceHandler("/vendor**bundle*js").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}		

		if (!registry.hasMappingForPattern("/vendor**bundle*js")) {
			registry.addResourceHandler("/vendor**bundle*js").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}				
		
		if (!registry.hasMappingForPattern("/polyfills**bundle*js")) {
			registry.addResourceHandler("/polyfills**bundle*js").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}				
		
		if (!registry.hasMappingForPattern("/inline**bundle*js")) {
			registry.addResourceHandler("/inline**bundle*js").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}		
		
		if (!registry.hasMappingForPattern("/scripts**bundle*js")) {
			registry.addResourceHandler("/scripts**bundle*js").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}		
		
		if (!registry.hasMappingForPattern("/main**bundle*js")) {
			registry.addResourceHandler("/main**bundle*js").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}			
		
		if (!registry.hasMappingForPattern("/styles**bundle*css")) {
			registry.addResourceHandler("//styles**bundle*css").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}				
	
		if (!registry.hasMappingForPattern("/**ttf")) {
			registry.addResourceHandler("/**ttf").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}			
		
		if (!registry.hasMappingForPattern("/**ttf")) {
			registry.addResourceHandler("/**ttf").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}		
		
		if (!registry.hasMappingForPattern("/**woff")) {
			registry.addResourceHandler("/**woff").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}		
	
		if (!registry.hasMappingForPattern("/**woff2")) {
			registry.addResourceHandler("/**woff2").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}	
		
		if (!registry.hasMappingForPattern("/browser-sync*")) {
			registry.addResourceHandler("/browser-sync*").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}	
		
		
		if (!registry.hasMappingForPattern("/updates*")) {
			registry.addResourceHandler("/updates*").addResourceLocations("file:./target/frontend/" , "classpath:./static/");
		}	
	}
}