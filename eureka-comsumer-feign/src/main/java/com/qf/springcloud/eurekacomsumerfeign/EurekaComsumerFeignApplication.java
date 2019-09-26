package com.qf.springcloud.eurekacomsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@EnableFeignClients("com.qf.service")
public class EurekaComsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaComsumerFeignApplication.class, args);
	}

}
