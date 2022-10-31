package com.company.examenFinal.muni;

public class Main {
    public static void main(String[] args) {
        Municipalidad muni = new Municipalidad("La Plata");



            Casa casa1 = (Casa)PropiedadFactory.getInstancia().crearPropiedad("Casa");
            Propiedad casa2 = PropiedadFactory.getInstancia().crearPropiedad("Casa");
            BarrioCerrado barrio1 = (BarrioCerrado) PropiedadFactory.getInstancia().crearPropiedad("Barrio Cerrado");
            BarrioCerrado barrio2 = (BarrioCerrado) PropiedadFactory.getInstancia().crearPropiedad("Barrio Cerrado");

            try {
                Propiedad prop = PropiedadFactory.getInstancia().crearPropiedad("Condominio");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());

            }
            casa1.setCalle("Av. San Martín");
            casa1.setNumero(130);
            casa1.setMontoBase(500);

            casa2.setCalle("Mitre");
            casa2.setNumero(233);
            ((Casa)casa2).setMontoBase(700);

            barrio1.setCalle("Gutierres");
            barrio1.setNumero(330);
            barrio1.setFactorMulti(2);
            barrio1.agregarPropiedad(casa1);
            barrio1.agregarPropiedad(casa2);


            barrio2.setCalle("AV. siempre viva 742"); // esto no se, lo puse para probar una cosa pero no lo use pero lo deje aca de onda
            barrio2.setNumero(30);
            barrio2.setFactorMulti(2);
            barrio2.agregarPropiedad(casa1);
            barrio2.agregarPropiedad(casa2);

            muni.agregarPropiedad(barrio1);
            muni.agregarPropiedad(barrio1);
            muni.agregarPropiedad(casa1);
            muni.agregarPropiedad(casa2);




        muni.mostrar();
    }
}
