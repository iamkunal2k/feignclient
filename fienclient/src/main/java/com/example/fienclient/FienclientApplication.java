package com.example.fienclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class FienclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FienclientApplication.class, args);
	}

}
