/*

Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:

En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.

Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class PeliculaServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas;
    
    public PeliculaServicio() {
        peliculas = new ArrayList();
    }
    
    public void crearPelicula(){
        Pelicula peli = new Pelicula();
        System.out.println("Ingrese el titulo de la pelicula: ");
        peli.setTitulo(leer.next());
        System.out.println("Ingrese el director de la pelicula: ");
        peli.setDirector(leer.next());
        System.out.println("Ingrese la duracion de la pelicula: ");
        peli.setDuracion(leer.nextInt());
        peliculas.add(peli);
    }
    
    public void mostrarPeliculas(){
        int cont = 0;
        System.out.println("Las peliculas agregadas a la lista son: ");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("");
        for (Pelicula pelicula : peliculas) {
            
            if(pelicula.getDuracion() > 1){
                if(cont == 0){
                    System.out.println("Las peliculas que duran mas de 1 hora son: ");
                }
                System.out.println(pelicula);
                cont++;
            }
            
        }
        
        if (cont == 0){
            System.out.println("No hay peliculas que duren mas de 1 hora.");
        }
        System.out.println("");
        System.out.println("El orden por duracion de mayor a menor: ");
        peliculas.sort(Pelicula.compararDuracionDesc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("");
        System.out.println("El orden por duracion de menor a mayor: ");
        peliculas.sort(Pelicula.compararDuracionAsc);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("");
        System.out.println("El orden por titulo alfabeticamente: ");
        peliculas.sort(Pelicula.compararTitulo);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        System.out.println("");
        System.out.println("El orden por director alfabeticamente: ");
        peliculas.sort(Pelicula.compararDirector);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
    }
}
