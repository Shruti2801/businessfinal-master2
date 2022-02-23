package com.example.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
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

//		@Bean
//		public Docket api() {
//			return new Docket(DocumentationType.SWAGGER_2)
//					.select()
//					.apis(RequestHandlerSelectors.any())
//					.paths(PathSelectors.any())
//					.build();
//		}
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



