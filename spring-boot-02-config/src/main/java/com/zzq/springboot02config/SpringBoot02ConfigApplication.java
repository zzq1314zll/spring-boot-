package com.zzq.springboot02config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.HashMap;

//@ImportResource(locations = "classpath:bean.xml")
@SpringBootApplication
public class SpringBoot02ConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02ConfigApplication.class, args);
	}
}
