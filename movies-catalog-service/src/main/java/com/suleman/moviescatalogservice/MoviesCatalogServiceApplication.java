package com.suleman.moviescatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MoviesCatalogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesCatalogServiceApplication.class, args);
	}
	
	@Bean
	//goes to Eureka Server to look up for URLS.
	@LoadBalanced
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

	/*@Bean
	public WebClient.Builder webClientBuilder()
	{
		return WebClient.builder();
	}*/
	
	
}
