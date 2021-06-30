package com.vn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.vn.config.StorageProperties;
import com.vn.service.StorageService;

@SpringBootApplication
//để sử dụng các thông số cấu hình trong StorageProperties
@EnableConfigurationProperties(StorageProperties.class)
public class SpringJava5AssShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJava5AssShopApplication.class, args);
	}

	@Bean
	CommandLineRunner init (StorageService storageService) {
		return (args -> {
			storageService.init();
		});
	}
}
