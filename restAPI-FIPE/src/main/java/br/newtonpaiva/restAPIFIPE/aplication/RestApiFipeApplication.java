package br.newtonpaiva.restAPIFIPE.aplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"br.newtonpaiva.restAPIFIPE"})
public class RestApiFipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiFipeApplication.class, args);
	}

}
