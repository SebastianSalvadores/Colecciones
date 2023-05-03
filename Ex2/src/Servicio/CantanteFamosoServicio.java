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
package Servicio;

import Entidad.CantanteFamoso;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class CantanteFamosoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public CantanteFamoso crearCantante(){
        System.out.println("Ingrese nombre del cantante: ");
        String nombre = leer.next();
        System.out.println("Ingrese el disco mas vendido: ");
        String disco = leer.next();
        return new CantanteFamoso(nombre,disco);
    }
    public void mostrarLista(List<CantanteFamoso> lista){
        for (CantanteFamoso aux : lista) {
            System.out.println(aux);
        }
    }
    public void eliminarCantante(List<CantanteFamoso> lista){
        boolean bandera = false;
        System.out.println("Ingrese cantante a eliminar: ");
        String cantante = leer.next();
        Iterator<CantanteFamoso> it = lista.iterator();
        while(it.hasNext()){
            if (it.next().getNombre().equalsIgnoreCase(cantante)){
                it.remove();
                System.out.println("El cantante fue eliminado de la lista.");
                bandera = true;
                break;
            }
        }
        if(bandera == false){
            System.out.println("El cantante no fue encontrado.");
        }
    }
}
