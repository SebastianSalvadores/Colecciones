/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
numero.

• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package ex4;

import Servicio.CiudadServicio;

/**
 *
 * @author Sebastian
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CiudadServicio cs = new CiudadServicio();
        System.out.println("Ingrese los codigos postales de 10 ciudades.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ciudad "+(i+1));
            cs.agregarCiudad();
        }
        System.out.println("\nCiudades:");
        cs.mostrarDatos();
        cs.mostrarCiudad();
        System.out.println("\nAgrega una ciudad.");
        cs.agregarCiudad();
        System.out.println("\nCiudades:");
        cs.mostrarDatos();
        System.out.println("\nElimina 3 ciudades existentes.");
        for (int i = 0; i < 3; i++) {
            System.out.println("Ciudad "+(i+1));
            cs.eliminarCiudad();
        }
        System.out.println("\nCiudades:");
        cs.mostrarDatos();
    }
    
}
