package com.example.fienclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.fienclient2.feign")
public class Fienclient2Application {

	public static void main(String[] args) {
		SpringApplication.run(Fienclient2Application.class, args);
	}

}
