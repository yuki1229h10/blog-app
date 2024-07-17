package com.example.spring_boot_blog_application.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_blog_application.models.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
	Optional<Account> findOneByEmail(String email);
}
