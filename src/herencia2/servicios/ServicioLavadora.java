package herencia2.servicios;

import herencia2.entidades.Electrodomestico;
import herencia2.entidades.Lavadora;
import herencia2.enumeraciones.ConsumoEnergetico;

public class ServicioLavadora extends ServicioElectrodomestico{
    
    public Lavadora crearLavadora(){
        Electrodomestico e = super.crearElectrodomestico();
        
        System.out.print("Ingrese la carga de la lavadora>> "); Double carga = super.input.nextDouble();
        
        Lavadora l = new Lavadora(carga, e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        
        l.setPrecio(precioFinal(l));
        return l;
    }
    
    /**
     * Retorna precioFinal de un objeto tipo Lavadora mediante sus atributos: Double Precio, Double Carga.
     * @param l 
     * @return 
     */
    public Double precioFinal(Lavadora l){
        if(l.getCarga()>30d){return super.precioFinal(l)+500d;}else{return super.precioFinal(l);}
    }
}