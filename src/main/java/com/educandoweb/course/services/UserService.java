package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.reporitories.UserRepository;


@Service
public class UserService {

	@Autowired
	private UserRepository UserRepository; // Injete o UserRepository

	public List<User> findAll() { // Altere o tipo de retorno para List<User>
		return UserRepository.findAll(); // Chame o método findAll do UserRepository
	}

	public User findById(Long id) { // Altere o tipo de retorno para User
		Optional<User> obj = UserRepository.findById(id); // Chame o método findById do UserRepository
		return obj.get();
	}
}
