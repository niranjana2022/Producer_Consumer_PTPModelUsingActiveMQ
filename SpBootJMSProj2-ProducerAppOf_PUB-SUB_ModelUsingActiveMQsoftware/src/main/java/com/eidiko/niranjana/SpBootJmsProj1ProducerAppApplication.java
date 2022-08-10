package com.eidiko.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpBootJmsProj1ProducerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpBootJmsProj1ProducerAppApplication.class, args);
	}

}
