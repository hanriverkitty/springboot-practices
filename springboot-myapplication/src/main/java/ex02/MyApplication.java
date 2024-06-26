package ex02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

// 다른 어노테이션을 상속받은 어노테이션 = 메타 어노테이션
@SpringBootConfiguration
public class MyApplication {

	@Bean
	public MyComponent myComponent() {
		return new MyComponent();
	}
	public static void main(String[] args) {
		try(ConfigurableApplicationContext ac =	SpringApplication.run(MyApplication.class, args)){
			MyComponent myComponent = ac.getBean(MyComponent.class);
			System.out.println(myComponent);
		}
	}
}
