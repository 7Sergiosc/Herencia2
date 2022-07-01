package herencia2.servicios;

import herencia2.entidades.Electrodomestico;
import herencia2.entidades.Televisor;
import herencia2.enumeraciones.ConsumoEnergetico;

public class ServicioTelevisor extends ServicioElectrodomestico{
        
    public Televisor crearTelevisor(){
        Electrodomestico e = super.crearElectrodomestico();
        
        System.out.print("Ingresa la resolución de la TV en pulgadas> "); Double pulgadas = super.input.nextDouble();
        Boolean sintonizadorTDT = tieneSintonizadorTDT();
        
        Double precio = precioFinal(pulgadas, sintonizadorTDT, e.getPrecio(), e.getConsumoEnergetico(), e.getPeso());
        
        return new Televisor(pulgadas, sintonizadorTDT, precio, e.getColor(), e.getConsumoEnergetico(), e.getPeso());
    }
    
    public Double precioFinal(Double pulgadas,Boolean sintonizadorTDT,Double precio, ConsumoEnergetico consumoE, Double peso){
        Double precioFinal = precio;
        
        if (pulgadas>40d) {
            precioFinal = precioFinal*1.30;
         }
        if(sintonizadorTDT){
                precioFinal += 500;
        } 
        return precioFinal;
    }
    
    public Boolean tieneSintonizadorTDT(){
        String TDT;
        do {
            System.out.print("Ingresa si tiene o no Sintonizador TDT> S/N "); TDT = super.input.next();
        } while (!TDT.equalsIgnoreCase("S") &&  !TDT.equalsIgnoreCase("N"));
        if (TDT.equalsIgnoreCase("S")) {
            return true;
        }else{
            return false;
        }
    }
}