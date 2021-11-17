package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		HelloData helloData = new HelloData();
		helloData.setData("Hello first Project");
		String data = helloData.getData();
		System.out.println("data = " + data);


		SpringApplication.run(JpashopApplication.class, args);
	}

}
