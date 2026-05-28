package com.seuhabito.sistema_habitos.model;


import jakarta.persistence.*;
import lombok.Data;
import jakarta.persistence.PrePersist;
import java.time.LocalDate;

import java.util.Optional;

@Entity
@Data
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = true)
    private String descricao;

    @Column(nullable = false)
    private boolean concluida = false;

    @Column(name = "data_criacao", nullable = false, updatable = false)
    private LocalDate dataCriacao;

    @PrePersist
    protected void onCreate() {
        dataCriacao = LocalDate.now();
    }


    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getDescricao() {return descricao;}
    public void setDescricao(String descricao) {this.descricao = descricao;}

    public boolean isConcluida() {return concluida;}
    public void setConcluida(boolean concluida) {this.concluida = concluida;}

    public LocalDate getDataCriacao() {return dataCriacao;}
    public void setDataCriacao(LocalDate dataCriacao) {this.dataCriacao = dataCriacao;}

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
}
