package com.mackenzie.genericos.Genericos.to;

import com.mackenzie.genericos.Genericos.modelo.Serie;

import javax.validation.constraints.NotBlank;

public class NewSerie {

    private String nomeTitulo;
    private String elenco;
    private String temp;
    private String pais;
    private String anoLancamento;
    private String urlImagem;
    private String diretor;

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public void setNomeTitulo(String nomeTitulo) {
        this.nomeTitulo = nomeTitulo;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String numTemporadas) {
        this.temp = temp;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
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



    public Serie paraSerie() {
        Serie serie = new Serie(getNomeTitulo(), getElenco(), conver(), getUrlImagem(),getDiretor());
        System.out.println(anoLancamento);
        int data = Integer.parseInt(anoLancamento);
        serie.setLancamento(data);
        serie.setPais(pais);
        return serie;
    }


    public int conver(){
        int temp = Integer.parseInt(getTemp());
        return temp;
    }
}
