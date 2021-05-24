package com.mackenzie.genericos.Genericos.repositorio;

import com.mackenzie.genericos.Genericos.modelo.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioFilme extends JpaRepository<Filme, Long> {
}
