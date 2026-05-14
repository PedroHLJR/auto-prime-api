package com.auto_prime.demo.controller;

import com.auto_prime.demo.model.Veiculo;
import com.auto_prime.demo.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    // GET /api/veiculos — lista todos os veículos
    @GetMapping
    public List<Veiculo> listarTodos() {
        return veiculoService.listarTodos();
    }

    // GET /api/veiculos/{id} — busca um veículo por ID
    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> buscarPorId(@PathVariable Long id) {
        return veiculoService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // GET /api/veiculos/marca/{marca} — filtra por marca
    @GetMapping("/marca/{marca}")
    public List<Veiculo> buscarPorMarca(@PathVariable String marca) {
        return veiculoService.buscarPorMarca(marca);
    }

    // GET /api/veiculos/situacao/{situacao} — filtra por situação
    @GetMapping("/situacao/{situacao}")
    public List<Veiculo> buscarPorSituacao(@PathVariable String situacao) {
        return veiculoService.buscarPorSituacao(situacao);
    }

    // POST /api/veiculos — cadastra um novo veículo
    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        return veiculoService.salvar(veiculo);
    }

    // PUT /api/veiculos/{id} — atualiza um veículo existente
    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        return veiculoService.atualizar(id, veiculo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE /api/veiculos/{id} — remove um veículo
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (veiculoService.deletar(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

}
