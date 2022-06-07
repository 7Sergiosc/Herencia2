package herencia2.enumeraciones;

public enum color {
    BLANCO ("Blanco"),
    NEGRO ("Negro"),
    ROJO ("Rojo"),
    AZUL ("Azul"),
    GRIS ("Gris");
    
    private final String nombre;

    private color(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
