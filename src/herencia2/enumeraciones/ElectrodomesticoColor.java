package herencia2.enumeraciones;

public enum ElectrodomesticoColor {
    BLANCO ("Blanco"),
    NEGRO ("Negro"),
    ROJO ("Rojo"),
    AZUL ("Azul"),
    GRIS ("Gris");
    
    private final String nombre;

    private ElectrodomesticoColor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
