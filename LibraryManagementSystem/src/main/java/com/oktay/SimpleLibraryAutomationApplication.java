package com.oktay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.oktay.repository.AuthorRepository;

/**
 * @author oktay
 *
 */
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {AuthorRepository.class})
public class SimpleLibraryAutomationApplication  extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SimpleLibraryAutomationApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SimpleLibraryAutomationApplication.class, args);
	}

}
