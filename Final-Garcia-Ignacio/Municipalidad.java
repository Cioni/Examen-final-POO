package com.company.examenFinal.muni;



import java.util.ArrayList;

public class Municipalidad {


    private String nombre;
    private ArrayList<Propiedad> propiedadesMuni;

    public Municipalidad(String nombre) {
        this.nombre = nombre;
        this.propiedadesMuni = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Propiedad> getPropiedadesMuni() {
        return propiedadesMuni;
    }

    public void setPropiedadesMuni(ArrayList<Propiedad> propiedadesMuni) {
        this.propiedadesMuni = propiedadesMuni;
    }


    public void agregarPropiedad(Propiedad p){
        propiedadesMuni.add(p);
    }

    public void mostrar(){
        System.out.println("-");
        System.out.println("-");
        System.out.println("-");// pa dividir el print

        System.out.println("en La Plata las calles son con numero pero bueno");


        System.out.println("-");// pa dividir el print
        System.out.println("-");

        String clase = "";

        System.out.println(("Municipalidad de " + nombre).toUpperCase());

        System.out.println(".");

        System.out.println("Las propiedades pertenecientes son: \n-------HOLA SOY UNA BARRA DIVISORA-----");
        for (Propiedad p : propiedadesMuni) {
            if(p.getClass().getName().equals("com.company.examenFinal.Casa")){
                clase = "Casa";
            }else if(p.getClass().getName().equals("com.company.examenFinal.BarrioCerrado")){
                clase = "Barrio Cerrado";
            }
            System.out.println("------------ " + clase + " ------------");
            System.out.println("Direccion: " + p.getCalle() + " " + p.getNumero() + "\n" + "Impuestos: $" + p.calcularImpuesto());

        }
        System.out.println("-------HOLA SOY UNA BARRA DIVISORA-----");
    }

}
