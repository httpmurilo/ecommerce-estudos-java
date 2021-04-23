package com.minhaempresa.commerce.Repository.Interfaces;

import com.minhaempresa.commerce.Model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category,Integer> {
}
