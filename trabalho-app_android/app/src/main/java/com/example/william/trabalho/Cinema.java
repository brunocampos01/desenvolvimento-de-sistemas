package com.example.william.trabalho;

import java.util.List;

/**
 * Created by william on 14/06/17.
 */

public class Cinema {

    private String nome;
    private String localizacao;

    public static Cinema createCinema(){
        Cinema cinema = new Cinema();
        cinema.setLocalizacao("Iguatemi");
        cinema.setNome("Cinesystem");

        return cinema;
    }

    public static Cinema createCinema2(){
        Cinema cinema = new Cinema();
        cinema.setLocalizacao("Floripa Shopping");
        cinema.setNome("Cinemark");
        return cinema;
    }

    public static Cinema createCinema3(){
        Cinema cinema = new Cinema();
        cinema.setLocalizacao("Beira Mar");
        cinema.setNome("Cinespaço");
        return cinema;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
