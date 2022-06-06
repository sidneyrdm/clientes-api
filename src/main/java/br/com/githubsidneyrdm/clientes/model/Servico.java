package br.com.githubsidneyrdm.clientes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String descricao;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    @Column
    private BigDecimal valor;
}
