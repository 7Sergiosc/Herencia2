package herencia2.servicios;

import herencia2.entidades.Electrodomestico;
import herencia2.entidades.Lavadora;
import herencia2.enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

public class ServicioLavadora {
    ServicioElectrodomestico se = new ServicioElectrodomestico();
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Lavadora crearLavadora(){
        Electrodomestico e = se.crearElectrodomestico();
        System.out.print("Ingrese la carga de la lavadora>> "); Double carga = se.input.nextDouble();
        
        Double precio = precioFinal(carga, e.getPrecio(),e.getConsumoEnergetico(), e.getPeso());
        
        return new Lavadora(carga, precio, e.getColor(), e.getConsumoEnergetico(), e.getPeso());
    }
    
    public Double precioFinal(Double carga, Double precio, ConsumoEnergetico consumo, Double peso){
        if(carga>30d){return precio+500d;}else{return precio;}
    }
    
}