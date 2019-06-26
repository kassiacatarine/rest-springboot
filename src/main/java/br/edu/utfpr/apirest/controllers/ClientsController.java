package br.edu.utfpr.apirest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.utfpr.apirest.entities.Client;
import br.edu.utfpr.apirest.repositories.ClientRepository;

/**
 * ClientsController
 */
@RestController
public class ClientsController {

    private final ClientRepository repository;

    public ClientsController(ClientRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/clients")
    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.ok(this.repository.findAll());
    }

    @GetMapping("/api/clients/{id}")
    public ResponseEntity<Client> findById(@PathVariable int id) {
        return ResponseEntity.ok(this.repository.findById(new Long(id)));
    }

    @PostMapping("/api/clients")
    public ResponseEntity<Client> create(@RequestBody Client client) {
        this.repository.save(client);
        return ResponseEntity.status(201).body(client);
    }

    @PutMapping("/api/clients/{id}")
    public ResponseEntity<Client> update(@PathVariable int id, @RequestBody Client client) {
        Optional<Client> clientOld = this.repository.findById(new Long(id));

        clientOld.ifPresent(c -> {
            c.setName(client.getName());
            c.setAge(client.getAge());
            c.setPhone(client.getPhone());
            c.setCreditLimit(client.getCreditLimit());
        });

        return ResponseEntity.of(clientOld);
    }

    @DeleteMapping("/api/clients/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        if (this.repository.findById(new Long(id)) != null) {
            this.repository.deleteById(new Long(id));
            return ResponseEntity.noContent().build();
        } else
            return ResponseEntity.notFound().build();
    }

}