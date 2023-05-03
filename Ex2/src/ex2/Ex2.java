/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package ex2;

import Entidad.CantanteFamoso;
import Servicio.CantanteFamosoServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ex2 {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public static void main(String[] args) {
        List<CantanteFamoso> cantantes = new ArrayList<>();
        CantanteFamosoServicio cfs = new CantanteFamosoServicio();
        System.out.println("Inicio de programa. Creando 5 elementos a la lista:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantante "+(i+1));
            cantantes.add(cfs.crearCantante());
        }
        System.out.println("");
        System.out.println("Elementos agregados a la lista: ");
        cfs.mostrarLista(cantantes);
        System.out.println("");
        int opc = 0;
        do {            
            System.out.println("******** MENU *********\n"
                    + "1. Agregar cantante\n"
                    + "2. Mostrar lista\n"
                    + "3. Eliminar cantante\n"
                    + "4. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("");
                    cantantes.add(cfs.crearCantante());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    cfs.mostrarLista(cantantes);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    cfs.eliminarCantante(cantantes);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Saliendo del programa.");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opcion incorrecta.");
                    System.out.println("");
            }
        } while (opc != 4);
    }
    
}
