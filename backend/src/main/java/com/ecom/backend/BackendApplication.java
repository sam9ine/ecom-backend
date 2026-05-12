package com.ecom.backend;

import com.ecom.backend.model.Product;
import com.ecom.backend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean

	CommandLineRunner runner(ProductRepository repository) {
		return args -> {

			repository.save(new Product("iPhone 15", 79999.0, "Latest Apple iPhone"));
			repository.save(new Product("Samsung S24", 74999.0, "Flagship Samsung Phone"));
			repository.save(new Product("Sony WH-1000XM5", 29999.0, "Best noise cancelling headphones"));

			System.out.println("Dummy products inserted successfully!");
		};
	}

}
