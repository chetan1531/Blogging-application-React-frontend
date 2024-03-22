package com.Project1.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project1.blog.entites.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

	
}
