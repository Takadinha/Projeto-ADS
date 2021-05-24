package com.mackenzie.genericos.Genericos.repositorio;

import com.mackenzie.genericos.Genericos.modelo.Obra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioObra extends JpaRepository<Obra, Long> {
}
