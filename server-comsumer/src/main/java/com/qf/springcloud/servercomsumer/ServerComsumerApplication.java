package com.qf.springcloud.servercomsumer;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.qf")
@EnableEurekaClient
@EnableHystrix
public class ServerComsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerComsumerApplication.class, args);
	}


	@Bean
	@LoadBalanced //负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean
	public RandomRule randomRule(){
		return new RandomRule();
	}

}

