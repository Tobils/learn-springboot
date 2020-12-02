package com.tobil.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProfilesApplication {


	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ProfilesApplication.class, args);
		System.out.println(ctx.getBean("datasource").toString());

	}

}
