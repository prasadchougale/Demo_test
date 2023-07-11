package com.prasadch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LambookDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambookDemoApplication.class, args);
		
		Demolambook obj=new Demolambook();
		
			obj.setId(21);
			obj.setName("Prasad");
			obj.setEmail("Prasachougale22@gmail.com");
		
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getEmail());
		
		
		
	}

}
