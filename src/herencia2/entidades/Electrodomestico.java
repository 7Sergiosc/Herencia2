package herencia2.entidades;

import herencia2.enumeraciones.ConsumoEnergetico;

public class Electrodomestico {
    //precio, color, consumo energético (letras entre A y F) y peso.
    protected Double precio;
    protected String color;
    protected ConsumoEnergetico consumoEnergetico;
    protected Double peso;
    
    public Electrodomestico() {
    }
  
    public Electrodomestico(Double precio, String color, ConsumoEnergetico consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    //  GETTERS & SETTERS
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
}