/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package ej1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ej1y2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();
        String raza,opc;
        boolean bandera = false;
        
        do {            
            System.out.println("Ingrese raza del perro:");
            raza = leer.next();
            razas.add(raza);
            do{
                System.out.println("¿Desea ingresar otra raza? (S/N)");
                opc = leer.next();
            }while(!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N"));
        } while (!opc.equalsIgnoreCase("N"));
        
        
        
        System.out.println("La lista queda conformada por: ");
        for (String aux : razas) {
            System.out.println(aux);
        }
        
        
        
        System.out.println("Ingrese raza a borrar de la lista:");
        raza = leer.next();
        Iterator<String> it = razas.iterator();
        while(it.hasNext()){
            if(it.next().equals(raza)){
                it.remove();
                bandera = true;
            }
        }
        if(bandera){
            System.out.println("La raza "+raza+" fue borrada de la lista.");
        }else{
            System.out.println("No se encontró "+raza+" en la lista.");
        }
        Collections.sort(razas);
        System.out.println("La lista de forma ordenada queda: ");
        for (String aux : razas) {
            System.out.println(aux);
        }
    }
    
}
