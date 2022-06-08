package br.com.githubsidneyrdm.clientes.rest;

import br.com.githubsidneyrdm.clientes.model.Cliente;
import br.com.githubsidneyrdm.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save( @RequestBody Cliente cliente ){
        return clienteRepository.save(cliente);
    }

    @GetMapping("/{id}")
    public Cliente getById(@PathVariable Integer id){
        return clienteRepository.findById(id)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
