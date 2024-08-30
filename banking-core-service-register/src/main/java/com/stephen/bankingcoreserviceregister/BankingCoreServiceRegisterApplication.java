package com.stephen.bankingcoreserviceregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankingCoreServiceRegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingCoreServiceRegisterApplication.class, args);
	}

}
