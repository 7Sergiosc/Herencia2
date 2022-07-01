package herencia2.servicios;

import herencia2.entidades.Electrodomestico;
import herencia2.entidades.Lavadora;
import herencia2.enumeraciones.ConsumoEnergetico;

public class ServicioLavadora extends ServicioElectrodomestico{
    
    public Lavadora crearLavadora(){
        Electrodomestico e = super.crearElectrodomestico();
        
        System.out.print("Ingrese la carga de la lavadora>> "); Double carga = super.input.nextDouble();
        
        
        Double precio = precioFinal(carga, e.getPrecio(),e.getConsumoEnergetico(), e.getPeso());
        
        return new Lavadora(carga, precio, e.getColor(), e.getConsumoEnergetico(), e.getPeso());
    }
    
    public Double precioFinal(Double carga, Double precio, ConsumoEnergetico consumo, Double peso){
        if(carga>30d){return precio+500d;}else{return precio;}
    }
    
}