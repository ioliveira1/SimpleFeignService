package br.com.ioliveira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SimpleFeignServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleFeignServiceApplication.class, args);
	}

}
