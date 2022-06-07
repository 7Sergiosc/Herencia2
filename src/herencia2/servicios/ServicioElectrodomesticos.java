package herencia2.servicios;

import herencia2.entidades.Electrodomestico;
import herencia2.enumeraciones.ElectrodomesticoColor;
import herencia2.enumeraciones.ConsumoEnergetico;
import herencia2.enumeraciones.ElectrodomesticoPeso;
import java.util.Scanner;

public class ServicioElectrodomesticos {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico crearElectrodomestico() {
        /*le pide la información al usuario y llena el electrodoméstico, 
    también llama los métodos para comprobar el ElectrodomesticoColor y el consumo. 
    Al precio se le da un valor base de $1000.*/
        System.out.println("Completa el formulario para el electrodoméstico:");

        
        System.out.print("\n Color (blanco, negro, rojo, azul y gris.) >>");
        String color = comprobarColor(input.next());

        System.out.print("\n Consumo Energético (A..F) >>");
        
        char cons = input.next().charAt(0);
        ConsumoEnergetico consumoE = comprobarConsumoEnergetico(cons);
        
        System.out.print("\n Peso en KG >>");
        Double peso = input.nextDouble();
        while(peso<1){
            System.out.println("Ingrese un peso mayor o igual a 1KG");
            System.out.print("\n Peso en KG >>");
            peso = input.nextDouble();
        }
        
        
        
        Double precio = precioFinal(1000d,consumoE, peso);

        return new Electrodomestico(precio, color, consumoE, peso);
    }

    private ConsumoEnergetico comprobarConsumoEnergetico(char letra) {/*comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. 
    Este método se debe invocar al crear el objeto y no será visible.*/
        ConsumoEnergetico consumoE;
        switch (letra) {
            case ('A'):
                consumoE = ConsumoEnergetico.A;
                break;
            case ('B'):
                consumoE = ConsumoEnergetico.B;
                break;
            case ('C'):
                consumoE = ConsumoEnergetico.C;
                break;
            case ('D'):
                consumoE = ConsumoEnergetico.D;
                break;
            case ('E'):
                consumoE = ConsumoEnergetico.E;
                break;
            case ('F'):
                consumoE = ConsumoEnergetico.F;
                break;
            default:
                System.out.println("Eleccion errónea, se auto-completará con 'F'");
                consumoE = ConsumoEnergetico.F;
        }
        return consumoE;
    }

    private String comprobarColor(String colorElegido) {
        /* comprueba que el ElectrodomesticoColor es correcto, y si no lo es, usa el ElectrodomesticoColor blanco por defecto
        Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. 
        No importa si el nombre está en mayúsculas o en minúsculas. 
        Este método se invocará al crear el objeto y no será visible.*/
        ElectrodomesticoColor[] colores = ElectrodomesticoColor.values();
        for (int i = 0; i < colores.length; i++) {
            if (colorElegido.equalsIgnoreCase(colores[i].getNombre())) {
                return colores[i].getNombre();
            }
        }
        System.out.println("Eleccion errónea, se auto-completará con 'Blanco'");
        return ElectrodomesticoColor.BLANCO.getNombre();
    }
    

    public Double precioFinal(Double precio, ConsumoEnergetico consumo, Double peso){
        /*según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios:*/
        ElectrodomesticoPeso[] listaPeso = ElectrodomesticoPeso.values();
        Double precioPeso = 0d;
        for (int i = 0; i < listaPeso.length; i++) {
            if(listaPeso[i].precioFinal(peso)){
                precioPeso = listaPeso[i].getPrecio();
                break;
            }  
        }
        
        precio += consumo.getPrecio() + precioPeso;
        return precio;
    }
}
