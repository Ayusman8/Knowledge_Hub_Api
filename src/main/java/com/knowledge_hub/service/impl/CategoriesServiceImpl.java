package com.knowledge_hub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knowledge_hub.entity.Categories;
import com.knowledge_hub.repository.CategoriesRepository;
import com.knowledge_hub.service.CategoriesService;

@Service
public class CategoriesServiceImpl implements CategoriesService{

	@Autowired
	CategoriesRepository repository;

	@Override
	public Categories createCategory(Categories category) {
		// TODO Auto-generated method stub
		return repository.save(category);
		
	}

	@Override
	public Categories editCategory(Categories category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteCategory(Categories category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Categories findCategoryById(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
