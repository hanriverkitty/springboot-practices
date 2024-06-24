package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 1. 스프링 애플리케이션의 부트스트래핑 역할: Bootstraping Class
 * 2. 설정클래스: Configuration Class 
 */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/**
		 * 	SpringApplication.run(...) 안에서 일어나는 일
		 * 
		 */
		try(ConfigurableApplicationContext ac =	SpringApplication.run(HelloWorldApplication.class, args)){}

//		ApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//		} catch(Throwable ex) {
//				
//		} finally {
//			((ConfigurableApplicationContext)ac).close();
//		}
	}
}