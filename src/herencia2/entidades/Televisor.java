package herencia2.entidades;

import herencia2.enumeraciones.ConsumoEnergetico;

public class Televisor extends Electrodomestico{
    private double pulgadas;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(double pulgadas, boolean sintonizadorTDT) {
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double pulgadas, boolean sintonizadorTDT, Double precio, String color, ConsumoEnergetico consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    
}