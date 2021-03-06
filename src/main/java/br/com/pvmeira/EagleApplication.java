package br.com.pvmeira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"br.com.pvmeira"}, lazyInit=true)
@SpringBootApplication
public class EagleApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(EagleApplication.class, args);
	}
}
