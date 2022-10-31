package com.company.examenFinal.muni;

public abstract class Propiedad {
    private String calle;
    private int numero;

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public abstract double calcularImpuesto();
}
