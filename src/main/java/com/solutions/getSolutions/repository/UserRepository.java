package com.solutions.getSolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.solutions.getSolutions.dao.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}