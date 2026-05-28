package com.seuhabito.sistema_habitos.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Habito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String metaDiaria;

    public Habito(){}

    public Habito(String nome, String metaDiaria){

        this.nome = nome;
        this.metaDiaria = metaDiaria;
    }


}
