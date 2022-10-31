package com.company.examenFinal.muni;

public class PropiedadFactory {
    private static PropiedadFactory instancia;

    private PropiedadFactory() {
    }

    public static PropiedadFactory getInstancia(){
        if(instancia==null){
            instancia = new PropiedadFactory();
        }
        return instancia;
    }

    public Propiedad crearPropiedad(String tipo) {
        switch (tipo){
            case "Casa":
                return new Casa();
            case "Barrio Cerrado":
                return new BarrioCerrado();
            default:
                throw new RuntimeException("Propiedad no valida");
        }
    }
}
