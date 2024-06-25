package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

// 다른 어노테이션을 상속받은 어노테이션 = 메타 어노테이션
@SpringBootConfiguration
@ComponentScan
public class MyApplication {
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac =	SpringApplication.run(MyApplication.class, args)){
		}
	}
}
