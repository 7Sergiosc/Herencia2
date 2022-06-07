package herencia2.enumeraciones;

public enum ElectrodomesticoPeso {
    entre_1_y_19 (19d, 100d),
    entre_20_y_49 (49d, 500d),
    entre_50_y_79 (79d, 800d),
    mayor_a_80 (9999999d, 1000d);
    
    private final Double pesoMax;
    private final Double precio;

    private ElectrodomesticoPeso(Double pesoMax, Double precio) {
        this.pesoMax = pesoMax;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }
      
    
    public boolean precioFinal(Double peso){
        return peso<=this.pesoMax;
    }
    
}
