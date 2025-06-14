package com.solutions.getSolutions.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.solutions.getSolutions.dao.User;
import com.solutions.getSolutions.repository.UserRepository;

@Service
public class UserService {

	private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
