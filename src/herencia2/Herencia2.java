package herencia2;

import herencia2.entidades.Electrodomestico;
import herencia2.servicios.ServicioElectrodomesticos;

public class Herencia2 {

    public static void main(String[] args) {
        ServicioElectrodomesticos se = new ServicioElectrodomesticos();

        Electrodomestico e = se.crearElectrodomestico();
        System.out.println(e.toString());
    }
    
}