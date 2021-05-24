package com.mackenzie.genericos.Genericos.repositorio;

import com.mackenzie.genericos.Genericos.modelo.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioSerie extends JpaRepository<Serie, Long> {
}
