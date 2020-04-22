package com.nayan.springboot.web;

import java.math.BigInteger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.nayan.springboot.web.*" })
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	String g="11";
	BigInteger s= new BigInteger(g);
	
	
	
	}

}