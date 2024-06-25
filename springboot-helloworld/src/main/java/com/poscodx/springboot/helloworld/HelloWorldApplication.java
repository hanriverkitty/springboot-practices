 package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 	SpringApplication의 역할
 * 1. 스프링 애플리케이션의 부트스트래핑 역할: Bootstraping Class
 * 2. 설정클래스: Configuration Class 
 */
@SpringBootApplication
public class HelloWorldApplication {
	
	
	public static void main(String[] args) {
		/**
		 * 	SpringApplication.run(...) 안에서 일어나는 일
		 *  1. 어플리케이션 컨텍스트 (Application Context = Spring Container) 생성
		 *  2. 만약, 웹애플리케이션이면 웹애플리케이션 타입 결정 (SpringMVC (전통적인 톰캣), Reactive (비동기 프로그래밍, 라이브러리로 작동 톰캣 필요 X)) -> view 단
		 *  3. 어노테이션 스캐닝 + Configuration Class 를 통해서 빈 생성/동록/와이어링 -> container 생성
		 *  4. 만약 웹 어플리케이션이고 타입이 Spring MVC 이면
		 *     - 내장(embeded) 서버(TomcatEmbededServiceServletContainer) 인스턴스 생성
		 *     - 서버 인스턴스에 웹애플리케이션을 배포  
		 *     - 서버 인스턴스 인스터스 실행
		 *   5. ApplicationRunner 인터페이스를 구현한 빈을 Application Context 에서 찾아서 실행  
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