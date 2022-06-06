package br.com.githubsidneyrdm.clientes.repository;

import br.com.githubsidneyrdm.clientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
