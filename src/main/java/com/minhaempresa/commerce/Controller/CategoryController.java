package com.minhaempresa.commerce.Controller;


import com.minhaempresa.commerce.Model.Category;
import com.minhaempresa.commerce.Repository.Interfaces.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CategoryController {

    @Autowired
    ICategoryRepository _repository;

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public ResponseEntity<String> persistCategory(@Valid @RequestBody  Category category) {
            _repository.save(category);
            return ResponseEntity.status(HttpStatus.CREATED).body("Sucess");
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public ResponseEntity<String> getAllCategory() {
        var result = _repository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body();
    }
}
