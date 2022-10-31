package com.company.examenFinal.muni;

import java.util.ArrayList;

public class BarrioCerrado extends Propiedad{
    private int factorMulti;
    private ArrayList<Propiedad> propiedades = new ArrayList<>();


    public int getFactorMulti() {
        return factorMulti;
    }

    public void setFactorMulti(int factorMulti) {
        this.factorMulti = factorMulti;
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(ArrayList<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public void agregarPropiedad(Propiedad p){
        propiedades.add(p);
    }
    @Override
    public double calcularImpuesto() {
        double impuestoBarrio = 0;
        for (Propiedad p : propiedades){
            impuestoBarrio += p.calcularImpuesto();
        }
        return impuestoBarrio* factorMulti;
    }
}


