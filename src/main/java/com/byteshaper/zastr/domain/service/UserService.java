package com.byteshaper.zastr.domain.service;

import com.byteshaper.zastr.domain.entity.User;
import com.byteshaper.zastr.domain.repository.UserRepository;
import com.byteshaper.zastr.dto.UserCreateDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * 
	 * @param user to create
	 * @return
	 */
	public User createUser(UserCreateDto user) {
		// TODO implement
		return null;
	}
}
