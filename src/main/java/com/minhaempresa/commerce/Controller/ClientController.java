package com.minhaempresa.commerce.Controller;

import com.minhaempresa.commerce.Model.Client;
import com.minhaempresa.commerce.Model.User;
import com.minhaempresa.commerce.Repository.Interfaces.IClientRepository;
import com.minhaempresa.commerce.Repository.Interfaces.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private IClientRepository _repository;

    @PostMapping
    public ResponseEntity<String> persistClient( @RequestBody Client client) {
        _repository.save(client);
        return ResponseEntity.status(HttpStatus.CREATED).body("{Sucess}");
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateClient(@Valid @RequestBody Client client) {
        _repository.save(client);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("{resource updated successfully}");
    }

    @GetMapping
    public ResponseEntity getAllClient() {
        return ResponseEntity.ok(_repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity getClientById(@PathVariable("id") Integer id) {
        return _repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteClientById(@PathVariable("id") Integer id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        _repository.deleteById(id);
        return ResponseEntity.ok("{sucess}");

    }
}
