package herencia2;

import herencia2.entidades.Electrodomestico;
import herencia2.entidades.Lavadora;
import herencia2.entidades.Televisor;
import herencia2.enumeraciones.ConsumoEnergetico;
import herencia2.servicios.ServicioElectrodomestico;
import herencia2.servicios.ServicioLavadora;
import herencia2.servicios.ServicioTelevisor;
import java.util.ArrayList;

public class Herencia2 {

    public static void main(String[] args) {
        ServicioLavadora sl = new ServicioLavadora();
//        Lavadora l = sl.crearLavadora();
        
        ServicioTelevisor st = new ServicioTelevisor();
//        Televisor t = st.crearTelevisor();
//        
//        System.out.println(l.toString()+"\n"+t.toString());
        ServicioElectrodomestico se = new ServicioElectrodomestico();


//        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        
        se.agregarElectrodomestico(new Televisor(50d,true,1000d,"azul",ConsumoEnergetico.A,25d));//500+1000+1000+30%+500=3750
        se.agregarElectrodomestico(new Televisor(35d,true,1000d,"blanco",ConsumoEnergetico.C,20d));//500+600+1000+500=2600
        se.agregarElectrodomestico(new Televisor(65d,true,1000d,"gris",ConsumoEnergetico.A,50d));//800+1000+1000+30%+500=4140
        se.agregarElectrodomestico(new Lavadora(50d,1000d,"negro",ConsumoEnergetico.B,45d));//500+800+1000+500=2800
        
        
        /*Iniciar la funcion de precioFinal()*/////////////////////////////////////////////////////////
        for (int i = 0; i < se.cantElectrodomesticos(); i++) {
            Electrodomestico e = se.getElectrodomesticos().get(i);
            if (e instanceof Lavadora) {
                e.setPrecio(sl.precioFinal((Lavadora) e)); 
            }else{
                e.setPrecio(st.precioFinal((Televisor) e));
            }
        }
        /*Mostrar los precios de los electrodomésticos en conjunto*/
//        double precioElectrodomesticos = 0;
//        for (int i = 0; i < se.cantElectrodomesticos(); i++) {
//            Electrodomestico e = se.getElectrodomesticos().get(i);
//            precioElectrodomesticos += e.getPrecio();
//        }
        
        /*Mostrar los precios de los electrodomésticos separados por tipo*/
        double precioLavadoras = 0;
        double precioTelevisores = 0;
        for (int i = 0; i < se.cantElectrodomesticos(); i++) {
            Electrodomestico e = se.getElectrodomesticos().get(i);
            if (e instanceof Lavadora){
                precioLavadoras += e.getPrecio();
            }else{
                precioTelevisores += e.getPrecio();
            }
        }
        
        
        System.out.println("------------------------------------------------------------------");
        se.mostrarElectrodomesticos();
        System.out.println("Precio Electrodomésticos = "+precioElectrodomesticos(se) + "\n" + "Precio Lavadoras = "+precioLavadoras + "\n" + "Precio Televisores = "+precioTelevisores);
    }
    
    /*FUNCIONES*/
    
    public static Double precioElectrodomesticos(ServicioElectrodomestico se){
        double precioElectrodomesticos = 0;
        for (int i = 0; i < se.cantElectrodomesticos(); i++) {
            Electrodomestico e = se.getElectrodomesticos().get(i);
            precioElectrodomesticos += e.getPrecio();
        }
        return precioElectrodomesticos;
    }
    
}