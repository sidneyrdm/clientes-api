package br.com.githubsidneyrdm.clientes.repository;

import br.com.githubsidneyrdm.clientes.model.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
