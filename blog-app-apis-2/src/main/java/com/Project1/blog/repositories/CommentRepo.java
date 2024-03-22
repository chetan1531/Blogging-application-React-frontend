package com.Project1.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project1.blog.entites.Comment;

public interface CommentRepo extends JpaRepository<Comment, Integer> {

	
}
