package com.example.arqdsis.prova1;

import java.io.Serializable;

/**
 * Created by arqdsis on 05/05/2017.
 */

// Fernanda Rachel - 201501934

public class Pais implements Serializable {

    private int id;
    private String nome;
    private String capital;
    private String area;
    private String populacao;
    private String moeda;

    public Pais(int id, String nome, String capital, String area, String populacao, String moeda) {
        this.id = id;
        this.nome = nome;
        this.capital = capital;
        this.area = area;
        this.populacao = populacao;
        this.moeda = moeda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public String getBandeira(){
        String foto = this.nome;
        return foto.replace('.', '_');
    }

}
