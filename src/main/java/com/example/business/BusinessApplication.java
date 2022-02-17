package com.example.business;

import com.example.business.model.Product;
import com.example.business.model.Service;
import com.example.business.model.Company;
import com.example.business.repository.ProductRepository;
import com.example.business.repository.ServiceRepository;
import com.example.business.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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

