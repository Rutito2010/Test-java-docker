package com.palasoft.msorquestadorartifact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Main class
 */
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class MsOrquestadorApplication {
	/**
	 * Main method
	 * @param args args
	 */
	public static void main(final String[] args) {
		SpringApplication.run(MsOrquestadorApplication.class, args);
	}

}
