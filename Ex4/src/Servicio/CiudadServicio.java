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
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class CiudadServicio {
    private Scanner leer;
    private HashMap<Integer,String> ciudades;
    private Integer cp;
    private String ciudad;
    
    public CiudadServicio() {
        ciudades = new HashMap<>();
        leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void agregarCiudad(){
        System.out.println("Ingrese codigo postal, sin la letra: ");
        cp = leer.nextInt();
        System.out.println("Ingrese a que ciudad pertenece el codigo postal: ");
        ciudad = leer.next();
        ciudades.put(cp, ciudad);
    }
    
    public void mostrarDatos(){
        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            System.out.println(entry.getValue()+", CP: "+entry.getKey());
        }
    }
    
    public void mostrarCiudad(){
        System.out.println("\nIngrese codigo postal de la ciudad a mostrar: ");
        cp = leer.nextInt();
        if(ciudades.containsKey(cp)){
            System.out.println(ciudades.get(cp)+", CP: "+cp);
        }else{
            System.out.println("No se encontró el Codigo Postal ingresado.");
        }
    }
    
    public void eliminarCiudad(){
        boolean bandera = false;
        do {            
            System.out.println("Ingrese codigo postal de la ciudad a eliminar:");
            cp = leer.nextInt();
            if(ciudades.containsKey(cp)){
                ciudades.remove(cp);
                System.out.println("La ciudad fue eliminada.");
                bandera = true;
            }else{
                System.out.println("El codigo postal no fue encontrado. Por favor, ingrese nuevamente.");
            }
        } while (bandera == false);
    }
}
