/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class PaisServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private HashSet<String> paisesSet;
    private ArrayList<String> paisesList;
    
    public PaisServicio() {
        paisesSet = new HashSet();
    }
    
    public void leerPaises(){
        String opc = "";
        do {            
            System.out.println("Ingrese pais: ");
            paisesSet.add(leer.next());
            do {                
                System.out.println("¿Desea agregar otro pais? (S/N)");
                opc = leer.next();
            } while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N"));
        } while (!opc.equalsIgnoreCase("N"));
    }
    
    public void mostrarPaises(){
        System.out.println("Los paises guardados en el conjunto son: ");
        for (String aux : paisesSet) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    
    public void ordenarConjunto(){
        paisesList = new ArrayList(paisesSet);
        Collections.sort(paisesList);
        System.out.println("Los paises ordenados alfabeticamente son: ");
        for (String aux : paisesList) {
            System.out.println(aux);
        }
        System.out.println("");
    }
    
    public void borrarPais(String pais){
        Iterator<String> it = paisesSet.iterator();
        boolean bandera = false;
        while(it.hasNext()){
            if(it.next().equalsIgnoreCase(pais)){
                it.remove();
                bandera = true;
            }
        }
        if(bandera){
            System.out.println("Se ha borrado el pais del conjunto, el cual queda de esta forma: ");
            for (String aux : paisesSet) {
                System.out.println(aux);
            }
        }else{
            System.out.println("No se ha encontrado el pais en el conjunto.");
        }
    }
}
