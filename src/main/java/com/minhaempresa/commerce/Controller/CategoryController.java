package com.minhaempresa.commerce.Controller;


import com.minhaempresa.commerce.Model.Category;
import com.minhaempresa.commerce.Repository.Interfaces.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    ICategoryRepository _repository;

    @PostMapping
    public ResponseEntity<String> persistCategory(@Valid @RequestBody  Category category) {
            _repository.save(category);
            return ResponseEntity.status(HttpStatus.CREATED).body("Sucess");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategory(@Valid @RequestBody  Category category) {
        _repository.save(category);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("resource updated successfully");
    }

    @GetMapping
    public ResponseEntity getAllCategory() {
        return ResponseEntity.ok(_repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable("id") Integer id) {
        return _repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable("id") Integer id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        _repository.deleteById(id);
        return ResponseEntity.ok("sucess");

    }
}
