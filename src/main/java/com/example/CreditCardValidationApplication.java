package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableDiscoveryClient
@RestController
@SpringBootApplication
public class CreditCardValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditCardValidationApplication.class, args);
	}
	
	
	@RequestMapping("/validateCard{cardNo}")
	public String validateCard(String cardNo){
		String cardType = null;
		if(cardNo.startsWith("4")){
			cardType = "Visa";
		}else if(cardNo.startsWith("5")){
			cardType = "Master";
		}else if(cardNo.startsWith("3")){
			cardType = "Diners";
		}else if(cardNo.startsWith("3")){
			cardType = "Discover";
		}
		return cardType;
	}
	
	
	@RequestMapping("/info")
	public String cardValidationInfo(){
		return "This service is used for Credit Card Validation. The input is to pass the credit card number and service returns with Card Type";
	}
	
	
	@RequestMapping("/info1")
	public String cardValidationInfo1(){
		return "This service is used for Credit Card Validation. The input is to pass the credit card number and service returns with Card Type";
	}
		
}
