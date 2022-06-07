package herencia2.entidades;

import herencia2.enumeraciones.ConsumoEnergetico;

public final class Lavadora extends Electrodomestico{
    private Double carga;
    
    
    // CONSTRUCTORS
    public Lavadora() {
    }
    
    
    public Lavadora(Double carga, Double precio, String color, ConsumoEnergetico consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }
    
    //GETTERS & SETTERS
    public Double getCarga(){
        return this.carga;
    }
    
    public void setCarga(Double carga){
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Electrodomestico: Lavadora{\n       Color="+super.color+", Consumo Energético="+super.consumoEnergetico+", Peso="+super.peso+", Precio="+super.precio;
    }
    
            
}