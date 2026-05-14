package com.auto_prime.demo.service;

import com.auto_prime.demo.model.Veiculo;
import com.auto_prime.demo.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    // Lista todos os veículos
    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    // Busca um veículo pelo ID
    public Optional<Veiculo> buscarPorId(Long id) {
        return veiculoRepository.findById(id);
    }

    // Busca veículos pela marca
    public List<Veiculo> buscarPorMarca(String marca) {
        return veiculoRepository.findByMarcaIgnoreCase(marca);
    }

    // Busca veículos pela situação
    public List<Veiculo> buscarPorSituacao(String situacao) {
        return veiculoRepository.findBySituacaoIgnoreCase(situacao);
    }

    // Cadastra um novo veículo
    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    // Atualiza um veículo existente
    public Optional<Veiculo> atualizar(Long id, Veiculo veiculoAtualizado) {
        return veiculoRepository.findById(id).map(veiculo -> {
            veiculo.setMarca(veiculoAtualizado.getMarca());
            veiculo.setModelo(veiculoAtualizado.getModelo());
            veiculo.setAno(veiculoAtualizado.getAno());
            veiculo.setCor(veiculoAtualizado.getCor());
            veiculo.setPlaca(veiculoAtualizado.getPlaca());
            veiculo.setChassi(veiculoAtualizado.getChassi());
            veiculo.setKmRodados(veiculoAtualizado.getKmRodados());
            veiculo.setPreco(veiculoAtualizado.getPreco());
            veiculo.setSituacao(veiculoAtualizado.getSituacao());
            veiculo.setDescricao(veiculoAtualizado.getDescricao());
            return veiculoRepository.save(veiculo);
        });
    }

    // Remove um veículo pelo ID
    public boolean deletar(Long id) {
        if (veiculoRepository.existsById(id)) {
            veiculoRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
