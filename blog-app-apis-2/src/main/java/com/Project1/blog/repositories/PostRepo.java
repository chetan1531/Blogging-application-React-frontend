package com.Project1.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project1.blog.entites.Category;
import com.Project1.blog.entites.Post;
import com.Project1.blog.entites.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	List<Post> findByTitleContaining(String title);
	
}
