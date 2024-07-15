package com.example.spring_boot_blog_application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_boot_blog_application.models.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
