package herencia2;

import herencia2.entidades.Lavadora;
import herencia2.entidades.Televisor;
import herencia2.servicios.ServicioLavadora;
import herencia2.servicios.ServicioTelevisor;

public class Herencia2 {

    public static void main(String[] args) {
        ServicioLavadora sl = new ServicioLavadora();
        Lavadora l = sl.crearLavadora();
        
        ServicioTelevisor st = new ServicioTelevisor();
        Televisor t = st.crearTelevisor();
        
        System.out.println(l.toString()+"\n"+t.toString());
    }
    
}