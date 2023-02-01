package com.app.rahul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RahulBorabandaRestApiCrudExOld1Application {

	public static void main(String[] args) {
		SpringApplication.run(RahulBorabandaRestApiCrudExOld1Application.class, args);
	}

	@Configuration
	public ModelMapper(){
	  return new ModelMapper();
	}

}
