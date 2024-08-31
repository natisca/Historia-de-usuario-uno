package com.emazonStock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmazonApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(EmazonApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
