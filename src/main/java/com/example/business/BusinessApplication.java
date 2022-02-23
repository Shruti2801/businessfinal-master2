package com.example.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BusinessApplication {

//	@Autowired
//	ProductRepository ob;
//
//	@Autowired
//	CompanyRepository ob1;
//
//	@Autowired
//	ServiceRepository ob2;

	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//
//		Company company = new Company(1,"DIPC","dipc");
//		ob1.save(company);
//		Product product= new Product(1,"SPRING");
//		ob.save(product);
//		Service service=new Service(1,"springboot");
//		ob2.save(service);
//	}
//	 implements CommandLineRunner

}

