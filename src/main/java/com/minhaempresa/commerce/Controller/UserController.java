package com.minhaempresa.commerce.Controller;

import com.minhaempresa.commerce.Model.Product;
import com.minhaempresa.commerce.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.minhaempresa.commerce.Repository.Interfaces.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserRepository _repository;

    @PostMapping
    public ResponseEntity<String> persistUser(@Valid @RequestBody User user) {
        _repository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body("{Sucess}");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@Valid @RequestBody  User user) {
        _repository.save(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("{resource updated successfully}");
    }

    @GetMapping
    public ResponseEntity getAllUser() {
        return ResponseEntity.ok(_repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getUserById(@PathVariable("id") Integer id) {
        return _repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUserById(@PathVariable("id") Integer id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        _repository.deleteById(id);
        return ResponseEntity.ok("{sucess}");

    }
}
