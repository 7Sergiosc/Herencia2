package herencia2.servicios;

import herencia2.entidades.Electrodomestico;
import herencia2.entidades.Televisor;
import herencia2.enumeraciones.ConsumoEnergetico;

public class ServicioTelevisor extends ServicioElectrodomestico{
        
    public Televisor crearTelevisor(){
        Electrodomestico e = super.crearElectrodomestico();
        
        System.out.print("Ingresa la resolución de la TV en pulgadas> "); Double pulgadas = super.input.nextDouble();
        
        Televisor t = new Televisor(pulgadas, tieneSintonizadorTDT(), e.getPrecio(), e.getColor(), e.getConsumoEnergetico(), e.getPeso());
        
        t.setPrecio(precioFinal(t));
        return t;
    }
    
    /**
     * Retorna precioFinal de un objeto tipo Televisor mediante sus atributos: Double precio, Double pulgadas y Boolean sintonizadorTDT.
     * @param t
     * @return 
     */
    public Double precioFinal(Televisor t){
        Double precioFinal = super.precioFinal(t);
        
        if (t.getPulgadas()>40d) {
            precioFinal = precioFinal*1.30;
         }
        if(t.isSintonizadorTDT()){
                precioFinal += 500;
        } 
        return precioFinal;
    }
    
    /**
     * Retorna Boolean de sintonizadorTDT dependiendo si el usuario ingresa 'S' para Si o 'N' para No
     * @return 
     */
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