package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.reporitories.ProductRepository;


@Service
public class ProductService {

	@Autowired
	private ProductRepository ProductRepository; // Injete o ProductRepository

	public List<Product> findAll() { // Altere o tipo de retorno para List<Product>
		return ProductRepository.findAll(); // Chame o método findAll do ProductRepository
	}

	public Product findById(Long id) { // Altere o tipo de retorno para Product
		Optional<Product> obj = ProductRepository.findById(id); // Chame o método findById do ProductRepository
		return obj.get();
	}
}
