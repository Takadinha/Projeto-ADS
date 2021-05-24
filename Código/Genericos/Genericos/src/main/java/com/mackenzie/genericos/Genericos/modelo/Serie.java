package com.mackenzie.genericos.Genericos.modelo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;

@Entity
@PrimaryKeyJoinColumn(name="idItem")
public class Serie extends Obra{

    private String atores;
    private int temporadas;
    private String diretor;

    public Serie(String nome, String atores, int temporadas, String urlimagem, String diretor){
        this.nome = nome;
        this.atores = atores;
        this.temporadas = temporadas;
        this.urlImagem = urlimagem;
        this.diretor = diretor;

    }

    public Serie() {

    }

    public String getAtores() {
        return atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
}

