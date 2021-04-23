package com.minhaempresa.commerce.Repository.Impl;

import com.minhaempresa.commerce.Model.Category;
import com.minhaempresa.commerce.Repository.Interfaces.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryRepository {

    @Autowired
    ICategoryRepository _repository;

    public void saveCategory(Category category){
        _repository.save(category);
    }
}
