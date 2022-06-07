package herencia2.enumeraciones;

public enum ConsumoEnergetico {
    A (1000d),
    B (800d),
    C (600d),
    D (500d),
    E (300d),
    F (100d);
    
    private final Double precio;

    private ConsumoEnergetico(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }
    
    
        
}
