package com.example.demo;

public class Kunde {
    private String fornavn;
    private String etternavn;
    private String eierBil;

    public Kunde(String fornavn, String etternavn, String eierBil) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.eierBil = eierBil;
    }

    public Kunde() {
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getEierBil() {
        return eierBil;
    }

    public void setEierBil(String eierBil) {
        this.eierBil = eierBil;
    }
}
