package com.seuhabito.sistema_habitos.controller;

import com.seuhabito.sistema_habitos.model.Tarefa;
import com.seuhabito.sistema_habitos.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    public List<Tarefa> listar(){
        return tarefaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tarefa> buscarPorId(@PathVariable Long id){
        return  tarefaRepository.findById(id);
    }

    @PostMapping
    public  Tarefa criar(@RequestBody Tarefa tarefa){
        return tarefaRepository.save(tarefa);
    }

    @PutMapping("/{id}")
    public  Tarefa atualizar(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada ){
        Tarefa tarefaExistente = tarefaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada com ID: " + id));

        tarefaExistente.setTitulo(tarefaAtualizada.getTitulo());
        tarefaExistente.setDescricao(tarefaAtualizada.getDescricao());
        tarefaExistente.setConcluida(tarefaAtualizada.isConcluida());

        return tarefaRepository.save(tarefaExistente);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id){
         tarefaRepository.deleteById(id);
         return "tarefa por id : " + id + "Removido com sucesso";

    }

    @PatchMapping("/{id}/concluir")
    public Tarefa concluir(@PathVariable Long id) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow();
        tarefa.setConcluida(true);
        return tarefaRepository.save(tarefa);
    }

    @GetMapping("/pendentes")
    public List<Tarefa> pendentes() {
        return tarefaRepository.findByConcluidaFalse();
    }
}

