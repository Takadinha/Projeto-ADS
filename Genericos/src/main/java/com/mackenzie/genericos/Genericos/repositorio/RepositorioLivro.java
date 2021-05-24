package com.mackenzie.genericos.Genericos.repositorio;

import com.mackenzie.genericos.Genericos.modelo.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioLivro extends JpaRepository<Livro, Long> {
}
