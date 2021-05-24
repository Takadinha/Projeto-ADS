package com.mackenzie.genericos.Genericos.modelo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDateTime;

@Entity
@PrimaryKeyJoinColumn(name="idItem")
public class Livro extends Obra{

    private String autor;
    private String editora;

    public Livro(String nome, String autor, String editora, String urlimagem){
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.urlImagem = urlimagem;
    }

    public Livro() {

    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
