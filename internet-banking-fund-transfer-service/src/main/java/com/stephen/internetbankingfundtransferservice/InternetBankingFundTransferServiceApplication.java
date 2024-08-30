package com.stephen.internetbankingfundtransferservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class InternetBankingFundTransferServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingFundTransferServiceApplication.class, args);
	}

}
