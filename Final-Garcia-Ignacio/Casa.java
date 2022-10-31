package com.company.examenFinal.muni;

public class Casa extends Propiedad{
    private double montoBase;

    public double getMontoBase() {
        return montoBase;
    }

    public void setMontoBase(double montoBase) {
        this.montoBase = montoBase;
    }

    @Override
    public double calcularImpuesto() {
        double impuesto=0;
        if(getCalle().equals("Av. San Martín")) {
            return impuesto = montoBase + (montoBase*0.1);
        }
        else return montoBase;
    }
}
