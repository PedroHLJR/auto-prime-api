package com.auto_prime.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "Veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "marca", length = 50)
    private String marca;

    @Column(name = "modelo", length = 50)
    private String modelo;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "cor", length = 30)
    private String cor;

    @Column(name = "placa", length = 10)
    private String placa;

    @Column(name = "chassi", length = 17)
    private String chassi;

    @Column(name = "km_rodados")
    private Integer kmRodados;

    @Column(name = "preco", precision = 10, scale = 2)
    private BigDecimal preco;

    @Column(name = "situacao", length = 50)
    private String situacao;

    @Column(name = "descricao", columnDefinition = "TEXT")
    private String descricao;

}
