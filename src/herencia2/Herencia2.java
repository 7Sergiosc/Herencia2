package herencia2;

import herencia2.entidades.Electrodomestico;
import herencia2.entidades.Lavadora;
import herencia2.servicios.ServicioElectrodomestico;
import herencia2.servicios.ServicioLavadora;

public class Herencia2 {

    public static void main(String[] args) {
        ServicioElectrodomestico se = new ServicioElectrodomestico();
        ServicioLavadora sl = new ServicioLavadora();
        Lavadora e = sl.crearLavadora();
        
        System.out.println(e.toString());
    }
    
}