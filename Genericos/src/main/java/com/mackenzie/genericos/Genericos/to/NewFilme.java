package com.mackenzie.genericos.Genericos.to;

import com.mackenzie.genericos.Genericos.modelo.Filme;

import javax.validation.constraints.NotBlank;

public class NewFilme {

    private String nomeTitulo;
    private String diretor;
    private String elenco;
    private String pais;
    private String anoLancamento;
    private String urlImagem;

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
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



    public Filme paraFilme() {
        Filme filme = new Filme(getNomeTitulo(), getDiretor(), getElenco(), getUrlImagem());
        System.out.println(anoLancamento);
        int data = Integer.parseInt(anoLancamento);
        filme.setLancamento(data);
        filme.setPais(pais);
        return filme;
    }
}
