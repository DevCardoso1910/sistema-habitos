package com.seuhabito.sistema_habitos.controller;

import com.seuhabito.sistema_habitos.model.Habito;
import com.seuhabito.sistema_habitos.repository.HabitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/habitos")
public class HabitoController {

    @Autowired
    private HabitoRepository habitoRepository;

    @GetMapping
    public List<Habito> listar() {
        return habitoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Habito> buscarPorId(@PathVariable Long id) {
        return habitoRepository.findById(id);
    }

    @PostMapping
    public Habito criar(@RequestBody Habito habito) {
        return habitoRepository.save(habito);
    }

    @PutMapping("/{id}")
    public Habito atualizar(@PathVariable Long id, @RequestBody Habito habitoAtualizado) {
        Optional<Habito> habitoExistente = habitoRepository.findById(id);

        if (habitoExistente.isPresent()) {
            Habito habito = habitoExistente.get();
            habito.setNome(habitoAtualizado.getNome());
            habito.setMetaDiaria(habitoAtualizado.getMetaDiaria());
            return habitoRepository.save(habito);
        } else {
            throw new RuntimeException("Hábito não encontrado com ID: " + id);
        }
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        habitoRepository.deleteById(id);
        return "Hábito com ID " + id + " foi removido com sucesso!";
    }
}