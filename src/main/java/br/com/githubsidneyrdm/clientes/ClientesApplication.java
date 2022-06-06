package br.com.githubsidneyrdm.clientes;

import br.com.githubsidneyrdm.clientes.model.Cliente;
import br.com.githubsidneyrdm.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientesApplication {

	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository clienteRepository){
		return args -> {
			Cliente cliente = new Cliente();
			cliente.setNome("Sidney brito");
			cliente.setCpf("07091538480");

			clienteRepository.save(cliente);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
