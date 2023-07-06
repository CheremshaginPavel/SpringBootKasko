package com.example.KaskoWebClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class KaskoClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(KaskoClientApplication.class, args);
	}
}
