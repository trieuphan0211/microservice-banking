package com.stephen.internetbankinguserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InternetBankingUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingUserServiceApplication.class, args);
	}

}
