package com.mackenzie.genericos.Genericos.modelo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;

@Entity
@PrimaryKeyJoinColumn(name="idItem")
public class Filme extends Obra{
    private String diretor;
    private String atores;
    private String duracao;


    public Filme(String nome, String diretor, String atores, String duracao, String urlimagem){
        this.nome = nome;
        this.diretor = diretor;
        this.atores = atores;
        this.duracao = duracao;
        this.urlImagem = urlimagem;

    }

    public Filme() {

    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
}