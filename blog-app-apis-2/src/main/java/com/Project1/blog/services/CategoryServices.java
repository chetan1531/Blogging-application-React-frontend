package com.Project1.blog.services;

import java.util.List;

import com.Project1.blog.payloads.CategoryDto;

public interface CategoryServices {

	 CategoryDto createCategory(CategoryDto categoryDto);
	 
	 CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	 
	 void deleteCategory(Integer categoryId);
	 
	 CategoryDto getCategory(Integer categoryId);
	 
	 List<CategoryDto> getCategories();
	 
	 
}
