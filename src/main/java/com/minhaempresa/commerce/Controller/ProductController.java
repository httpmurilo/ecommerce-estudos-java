package com.minhaempresa.commerce.Controller;

import com.minhaempresa.commerce.Model.Category;
import com.minhaempresa.commerce.Model.Product;
import com.minhaempresa.commerce.Repository.Interfaces.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductRepository _repository;

    @PostMapping
    public ResponseEntity<String> persistProduct(@Valid @RequestBody Product product) {
        _repository.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body("Sucess");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateProduct(@Valid @RequestBody  Product product) {
        _repository.save(product);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("resource updated successfully");
    }

    @GetMapping
    public ResponseEntity getAllProduct() {
        return ResponseEntity.ok(_repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getProductById(@PathVariable("id") Integer id) {
        return _repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteProductById(@PathVariable("id") Integer id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        _repository.deleteById(id);
        return ResponseEntity.ok("sucess");

    }


}
