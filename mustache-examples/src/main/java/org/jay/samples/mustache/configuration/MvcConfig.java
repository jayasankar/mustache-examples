package org.jay.samples.mustache.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.mustache.MustacheTemplateLoader;
import org.springframework.web.servlet.view.mustache.MustacheViewResolver;

/**
 * 
 * @author Jay
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.jay.samples.mustache")
public class MvcConfig {
	
	@Bean
	public ViewResolver getViewResolver(ResourceLoader resourceLoader) {
		MustacheViewResolver mustacheViewResolver = new MustacheViewResolver();
		mustacheViewResolver.setPrefix("/WEB-INF/templates/");
		mustacheViewResolver.setSuffix(".mustache");
		mustacheViewResolver.setCache(false);
		MustacheTemplateLoader mustacheTemplateLoader = new MustacheTemplateLoader();
		mustacheTemplateLoader.setResourceLoader(resourceLoader);
		mustacheViewResolver.setTemplateLoader(mustacheTemplateLoader);
		return mustacheViewResolver;
	}
	
	

}
