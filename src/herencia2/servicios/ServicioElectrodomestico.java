package herencia2.servicios;

import herencia2.entidades.Electrodomestico;
import herencia2.entidades.Televisor;
import herencia2.enumeraciones.ElectrodomesticoColor;
import herencia2.enumeraciones.ConsumoEnergetico;
import herencia2.enumeraciones.ElectrodomesticoPeso;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioElectrodomestico {
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
    
    public Electrodomestico crearElectrodomestico() {
        /*le pide la información al usuario y llena el electrodoméstico, 
    también llama los métodos para comprobar el ElectrodomesticoColor y el consumo. 
    Al precio se le da un valor base de $1000.*/
        System.out.println("Completa el formulario para el electrodoméstico:");

        String color = comprobarColor();

        System.out.print("\n Consumo Energético (A..F) >> ");
        ConsumoEnergetico consumoE = comprobarConsumoEnergetico();
        
        System.out.print("\n Peso en KG >> ");
        Double peso = input.nextDouble();
        while(peso<1){
            System.out.println("Ingrese un peso mayor o igual a 1KG");
            System.out.print("\n Peso en KG >> ");
            peso = input.nextDouble();
        }
        
        Electrodomestico e = new Electrodomestico(1000d,color, consumoE, peso);
        
//        e.setPrecio(precioFinal(e));

        return e;
    }

    
    private ConsumoEnergetico comprobarConsumoEnergetico(){
        String letra = input.next();
        
        ConsumoEnergetico consumoE = ConsumoEnergetico.F;
        letra = letra.toUpperCase();
        
        ConsumoEnergetico consumos[] = ConsumoEnergetico.values(); /*Convertir ENUM a ARRAY*/
        for (int i = 0; i < consumos.length; i++) {
            if (letra.equals(consumos[i].toString())) {
                consumoE = ConsumoEnergetico.valueOf(letra);
                System.out.println("Eleccion guardada correctamente: '"+consumoE.name()+"'");
                break;
            }else if(i==consumos.length-1){
                System.out.println("Eleccion errónea, se auto-completará con 'F'");
            }
        }                      
        return consumoE;
    }

    /**
     * String colorElegido mediante Input y lo comprueba en ElectrodomesticoColor, de no encontrarlo devuelve 'BLANCO'
     * @return 
     */
    private String comprobarColor() {
        /* comprueba que el ElectrodomesticoColor es correcto, y si no lo es, usa el ElectrodomesticoColor blanco por defecto
        Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. 
        No importa si el nombre está en mayúsculas o en minúsculas. 
        Este método se invocará al crear el objeto y no será visible.*/
        System.out.print("\n Color (blanco, negro, rojo, azul y gris.) >> "); String colorElegido = input.next();
        
        ElectrodomesticoColor[] colores = ElectrodomesticoColor.values();
        for (int i = 0; i < colores.length; i++) {
            if (colorElegido.equalsIgnoreCase(colores[i].getNombre())) {
                return colores[i].getNombre();
            }
        }
        System.out.println("Eleccion errónea, se auto-completará con 'Blanco'");
        return ElectrodomesticoColor.BLANCO.getNombre();
    }
    

    public Double precioFinal(Electrodomestico e){
        /*según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios:*/
        ElectrodomesticoPeso[] listaPeso = ElectrodomesticoPeso.values();
        Double precioPeso = 0d;
        for (int i = 0; i < listaPeso.length; i++) {
            if(listaPeso[i].precioFinal(e.getPeso())){
                precioPeso = listaPeso[i].getPrecio();
                break;
            }  
        }
        e.setPrecio(e.getPrecio() + e.getConsumoEnergetico().getPrecio() + precioPeso); 
        
        return e.getPrecio();
    }
    
    public void agregarElectrodomestico(Electrodomestico t){
        electrodomesticos.add(t);
    }
    public void mostrarElectrodomesticos(){
        electrodomesticos.forEach((aux) -> {System.out.println(aux);});
    }
    public int cantElectrodomesticos(){
        return electrodomesticos.size();
    }
    public ArrayList<Electrodomestico> getElectrodomesticos(){
        return electrodomesticos;
    }
}
