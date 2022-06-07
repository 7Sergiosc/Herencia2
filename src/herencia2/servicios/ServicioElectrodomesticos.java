package herencia2.servicios;

import herencia2.entidades.Electrodomestico;
import herencia2.enumeraciones.color;
import herencia2.enumeraciones.consumoEnergetico;
import java.util.Scanner;

public class ServicioElectrodomesticos {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico crearElectrodomestico() {
        /*le pide la información al usuario y llena el electrodoméstico, 
    también llama los métodos para comprobar el color y el consumo. 
    Al precio se le da un valor base de $1000.*/
        System.out.println("Completa el formulario para el electrodoméstico:");

        Double precio = 1000d;
        System.out.print("\n Color (blanco, negro, rojo, azul y gris.) >>");
        String color = comprobarColor(input.next());

        System.out.print("\n Consumo Energético (A..F) >>");

        char cons = input.next().charAt(0);
        consumoEnergetico consumoE = comprobarConsumoEnergetico(cons);

        System.out.print("\n Peso >>");
        Double peso = input.nextDouble();

        return new Electrodomestico(precio, color, consumoE, peso);
    }

    private consumoEnergetico comprobarConsumoEnergetico(char letra) {/*comprueba que la letra es correcta, sino es correcta usara la letra F por defecto. 
    Este método se debe invocar al crear el objeto y no será visible.*/
        consumoEnergetico consumoE;
        switch (letra) {
            case ('A'):
                consumoE = consumoEnergetico.A;
                break;
            case ('B'):
                consumoE = consumoEnergetico.B;
                break;
            case ('C'):
                consumoE = consumoEnergetico.C;
                break;
            case ('D'):
                consumoE = consumoEnergetico.D;
                break;
            case ('E'):
                consumoE = consumoEnergetico.E;
                break;
            case ('F'):
                consumoE = consumoEnergetico.F;
                break;
            default:
                System.out.println("Eleccion errónea, se auto-completará con 'F'");
                consumoE = consumoEnergetico.F;
        }
        return consumoE;
    }

    private String comprobarColor(String colorElegido) {
        /* comprueba que el color es correcto, y si no lo es, usa el color blanco por defecto
        Los colores disponibles para los electrodomésticos son blanco, negro, rojo, azul y gris. 
        No importa si el nombre está en mayúsculas o en minúsculas. 
        Este método se invocará al crear el objeto y no será visible.*/
        color[] colores = color.values();
        for (int i = 0; i < colores.length; i++) {
            if (colorElegido.equalsIgnoreCase(colores[i].getNombre())) {
                return colores[i].getNombre();
            }
        }
        System.out.println("Eleccion errónea, se auto-completará con 'Blanco'");
        return color.BLANCO.getNombre();
    }
    

//    public Double precioFinal(consumoEnergetico cons, Double peso){
//        /*según el consumo energético y su tamaño, aumentará el valor del precio. Esta es la lista de precios:*/         
//        return 20d;
//    }
}
