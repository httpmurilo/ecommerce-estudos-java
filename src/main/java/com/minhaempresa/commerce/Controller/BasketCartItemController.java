package com.minhaempresa.commerce.Controller;

import com.minhaempresa.commerce.Model.BasketCartItem;
import com.minhaempresa.commerce.Model.User;
import com.minhaempresa.commerce.Repository.Interfaces.IBasketCartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class BasketCartItemController {

    @Autowired
    IBasketCartItemRepository _repository;

    @PostMapping
    public ResponseEntity<String> persistBasketCartItem(@Valid @RequestBody BasketCartItem item) {
        _repository.save(item);
        return ResponseEntity.status(HttpStatus.CREATED).body("{Sucess}");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBasketCartItem(@Valid @RequestBody  BasketCartItem item) {
        _repository.save(item);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("{resource updated successfully}");
    }

    @GetMapping
    public ResponseEntity getAllBasketCartItens() {
        return ResponseEntity.ok(_repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getBasketCartItensById(@PathVariable("id") Integer id) {
        return _repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteBasketCartItensById(@PathVariable("id") Integer id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        _repository.deleteById(id);
        return ResponseEntity.ok("{sucess}");

    }

}
