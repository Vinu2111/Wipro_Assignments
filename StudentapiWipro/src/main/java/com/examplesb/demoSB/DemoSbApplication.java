package com.examplesb.demoSB;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSbApplication  implements ApplicationRunner{

	public static void main(String[] args) {
		SpringApplication.run(DemoSbApplication.class, args);
		System.out.println("App Started....");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
