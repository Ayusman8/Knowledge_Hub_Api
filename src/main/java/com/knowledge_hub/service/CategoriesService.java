package com.knowledge_hub.service;

import com.knowledge_hub.entity.Categories;

public interface CategoriesService {

	public Categories createCategory(Categories category);
	
	public Categories editCategory(Categories category);
	
	public boolean deleteCategory(Categories category);
	
	public Categories findCategoryById(int categoryId);
}
