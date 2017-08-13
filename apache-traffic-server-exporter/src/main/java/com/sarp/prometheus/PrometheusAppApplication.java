package com.sarp.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class PrometheusAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrometheusAppApplication.class, args);
	}
}
