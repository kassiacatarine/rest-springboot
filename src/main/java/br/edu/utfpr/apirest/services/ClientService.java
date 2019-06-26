package br.edu.utfpr.apirest.services;

import java.util.List;

import br.edu.utfpr.apirest.entities.Client;
import br.edu.utfpr.apirest.repositories.ClientRepository;

/**
 * ClientService
 */
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository repository) {
        this.repository = repository;
    }

    public List<Client> findAll() {
        return repository.findAll();
    }
}