package com.mackenzie.genericos.Genericos.to;

import com.mackenzie.genericos.Genericos.modelo.Livro;

import javax.validation.constraints.NotBlank;

public class NewLivro {
    private String nomeTitulo;
    private String autor;
    private String editora;
    private String pais;
    private String anoLancamento;
    private String urlImagem;

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String nomeAutor) {
        this.autor = nomeAutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }


    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }



    public Livro paraLivro()  {
        Livro livro = new Livro(getNomeTitulo(),getAutor(), getEditora(), getUrlImagem());
        System.out.println(anoLancamento);
        int data = Integer.parseInt(anoLancamento);
        livro.setLancamento(data);
        livro.setPais(pais);
        return livro;
    }
}

