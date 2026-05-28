package com.seuhabito.sistema_habitos.repository;

import com.seuhabito.sistema_habitos.model.Habito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitoRepository extends JpaRepository<Habito, Long> {
}