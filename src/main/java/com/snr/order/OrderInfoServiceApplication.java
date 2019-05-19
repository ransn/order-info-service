package com.snr.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderInfoServiceApplication.class, args);
	}

}
