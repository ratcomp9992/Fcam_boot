package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	// Auto-Configuration (web.xml 등 Spring Legacy의 환경설정을 하나로 통합)
public class DemoApplication {	// main을 가지고 있는 boot의 시작 지점.

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
	}

}
