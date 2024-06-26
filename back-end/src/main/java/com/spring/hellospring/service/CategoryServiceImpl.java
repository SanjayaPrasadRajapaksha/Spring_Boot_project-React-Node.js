package com.spring.hellospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hellospring.entity.Category;
import com.spring.hellospring.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category UpdateCategory(long id, Category category) {
        Category findCategory = categoryRepository.findById(id).orElse(null);

        if (findCategory == null) {
            return null;
        }
        {
            findCategory.setName(category.getName());
            return categoryRepository.save(category);

        }

    }

}
