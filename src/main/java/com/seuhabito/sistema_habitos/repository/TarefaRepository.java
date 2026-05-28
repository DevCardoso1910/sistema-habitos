package com.seuhabito.sistema_habitos.repository;

import com.seuhabito.sistema_habitos.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TarefaRepository  extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByConcluidaFalse();
}
