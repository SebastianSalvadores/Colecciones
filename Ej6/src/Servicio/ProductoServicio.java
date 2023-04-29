/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ProductoServicio {
    private Scanner leer;
    private HashMap<String, Integer> productos;

    public ProductoServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        productos = new HashMap();
    }
    
    public void menu(){
        int opc;
        do {            
            
            System.out.println("--------- MENU PRINCIPAL ---------\n"
                    + "1. Introducir un nuevo producto\n"
                    + "2. Modificar precio\n"
                    + "3. Eliminar producto\n"
                    + "4. Mostrar productos\n"
                    + "5. Salir\n"
                    + "\n"
                    + "Ingrese numero de opción:");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    //opcion1
                    break;
                case 2:
                    //opcion2
                    break;
                case 3:
                    //opcion3
                    break;
                case 4:
                    //opcion4
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opcion incorrecta");
                    System.out.println("");
            }
        } while(opc != 5);
    }
    
}
