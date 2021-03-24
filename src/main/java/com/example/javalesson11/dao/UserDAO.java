package com.example.javalesson11.dao;

import com.example.javalesson11.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

@Service
@EnableJpaRepositories
public interface UserDAO extends JpaRepository<User, Integer> {
}
