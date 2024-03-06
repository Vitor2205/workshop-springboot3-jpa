package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.reporitories.CategoryRepository;


@Service
public class CategoryService {

	@Autowired
	private CategoryRepository CategoryRepository; // Injete o CategoryRepository

	public List<Category> findAll() { // Altere o tipo de retorno para List<Category>
		return CategoryRepository.findAll(); // Chame o método findAll do CategoryRepository
	}

	public Category findById(Long id) { // Altere o tipo de retorno para Category
		Optional<Category> obj = CategoryRepository.findById(id); // Chame o método findById do CategoryRepository
		return obj.get();
	}
}
