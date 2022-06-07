package herencia2.entidades;

import herencia2.enumeraciones.consumoEnergetico;

public class Electrodomestico {
    //precio, color, consumo energético (letras entre A y F) y peso.
    protected Double precio;
    protected String color;
    protected consumoEnergetico consumoEnergetico;
    protected Double peso;

    public Electrodomestico() {
    }
  
    public Electrodomestico(Double precio, String color, consumoEnergetico consumoEnergetico, Double peso) {
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

    public consumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(consumoEnergetico consumoEnergetico) {
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