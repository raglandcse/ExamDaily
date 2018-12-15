package com.Rock;

import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.Rock.Verticles.ExamDailyVerticles;

import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;

/**
 * 
 * @author Ragland
 *
 */

@EnableJpaRepositories(basePackages = "com.Rock.Repository")
@EnableAsync
@EnableScheduling
@Configuration
@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class ExamDailyApplication {

	@Autowired
	private ExamDailyVerticles examDailyVerticles;

	public static void main(String[] args) {
		SpringApplication.run(ExamDailyApplication.class, args);
	}

	@PostConstruct
	public void deployVerticle() {
		VertxOptions options = new VertxOptions();
		options.setMaxEventLoopExecuteTime(Long.MAX_VALUE);
		final Vertx vertx = Vertx.vertx(options);
		vertx.deployVerticle(examDailyVerticles);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
