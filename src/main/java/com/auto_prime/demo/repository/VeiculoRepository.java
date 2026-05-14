package com.auto_prime.demo.repository;

import com.auto_prime.demo.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    // Busca veículos por marca (ex: /api/veiculos?marca=Toyota)
    List<Veiculo> findByMarcaIgnoreCase(String marca);

    // Busca veículos por situação (ex: disponível, vendido)
    List<Veiculo> findBySituacaoIgnoreCase(String situacao);

}
