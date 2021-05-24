package com.mackenzie.genericos.Genericos.to;

import com.mackenzie.genericos.Genericos.modelo.Livro;

import javax.validation.constraints.NotBlank;

public class NewLivro {
    @NotBlank
    private String nomeTitulo;
    @NotBlank
    private String nomeAutor;
    @NotBlank
    private String editora;
    @NotBlank
    private String pais;
    @NotBlank
    private String anoLancamento;
    @NotBlank
    private String genero;
    @NotBlank
    private String urlImagem;
    @NotBlank
    private String sinopse;

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Livro paraLivro()  {
        Livro livro = new Livro(getNomeTitulo(),getNomeAutor(), getEditora(), getUrlImagem());
        System.out.println(anoLancamento);
        int data = Integer.parseInt(anoLancamento);
        livro.setGenero(genero);
        livro.setLancamento(data);
        livro.setPais(pais);
        livro.setSinopse(sinopse);
        return livro;
    }
}

