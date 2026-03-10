package com.java.enset.springmvcproductapp;

import com.java.enset.springmvcproductapp.entity.Product;
import com.java.enset.springmvcproductapp.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMvcProductAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcProductAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner start(ProductRepository productRepository) {
		return args -> {
			productRepository.save(Product.builder()
					.name("Telefon")
					.price(30d)
					.quantity(20)
					.build());
			productRepository.save(Product.builder()
					.name("Pisi")
					.price(80d)
					.quantity(10)
					.build());
			productRepository.save(Product.builder()
					.name("sa3a")
					.price(1d)
					.quantity(30)
					.build());
			productRepository.save(Product.builder()
					.name("sadfwer")
					.price(1d)
					.quantity(30)
					.build());
			productRepository.save(Product.builder()
					.name("ksdf")
					.price(1d)
					.quantity(30)
					.build());
			productRepository.save(Product.builder()
					.name("jsdj")
					.price(1d)
					.quantity(30)
					.build());
			productRepository.save(Product.builder()
					.name("sa3a")
					.price(1d)
					.quantity(30)
					.build());
			productRepository.save(Product.builder()
					.name("hjy")
					.price(1d)
					.quantity(30)
					.build());
			productRepository.save(Product.builder()
					.name("vbmn")
					.price(1d)
					.quantity(30)
					.build());
		};
	}


}
