package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.User;

	// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
	// CRUD refers Create, Read, Update, Delete
@Repository
	public interface UserRepository extends JpaRepository<User, Long> {
		
		User findByEmailAndPassword(String email, String password);
		
		User findByEmail(String email);
	
}
