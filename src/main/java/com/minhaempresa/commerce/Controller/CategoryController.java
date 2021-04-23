package com.minhaempresa.commerce.Controller;


import com.minhaempresa.commerce.Model.Category;
import com.minhaempresa.commerce.Repository.Interfaces.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @Autowired
    ICategoryRepository _repository;

    @PostMapping("/category")
    @ResponseStatus(HttpStatus.CREATED)
    Category Create(@RequestBody Category category){
        return _repository.save(category);
    }
}
