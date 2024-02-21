package com.budgettracking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.budgettracking.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	
}
