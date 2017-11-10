package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix//等同于@EnableCircuitBreaker
@EnableDiscoveryClient
@EnableHystrixDashboard//开启hystrixDashboard
@SpringBootApplication
public class SpringCloudRibbonHystrixDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudRibbonHystrixDashboardApplication.class, args);
	}
	
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
