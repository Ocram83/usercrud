package it.ocramsoft.usercrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "it.ocramsoft.usercrud")
public class UserCrudApplication 
{
	public static void main(String[] args) {
		SpringApplication.run(UserCrudApplication.class, args);
	}
}
