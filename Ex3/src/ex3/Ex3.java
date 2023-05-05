/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de
cada uno de los libros de una Biblioteca. La clase Libro debe guardar el título del libro,
autor, número de ejemplares y número de ejemplares prestados. También se creará en
el main un HashSet de tipo Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.

La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
• Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método.
El método se incrementa de a uno, como un carrito de compras, el atributo
ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada vez que
se realice un préstamo del libro. No se podrán prestar libros de los que no queden
ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la
operación y false en caso contrario.
• Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo
busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método. El
método decrementa de a uno, como un carrito de compras, el atributo ejemplares
prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se
produzca la devolución de un libro. No se podrán devolver libros donde que no
tengan ejemplares prestados. Devuelve true si se ha podido realizar la operación y
false en caso contrario.
• Método toString para mostrar los datos de los libros.
 */
package ex3;

import Entidad.Libro;
import Servicio.LibroServicio;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Sebastian
 */
public class Ex3 {
    
    public static void main(String[] args) {
        Set<Libro> libreria = new HashSet<>();
        Libro libro;
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String opc1 = "";
        LibroServicio ls = new LibroServicio();
        do {            
            libro = ls.crearLibro();
            libreria.add(libro);
            System.out.println("El libro fue añadido a la biblioteca.");
            do{
                System.out.println("¿Desea añadir otro libro a la biblioteca?(S/N)");
                opc1 = leer.next();
                if(!opc1.equalsIgnoreCase("S") && !opc1.equalsIgnoreCase("N")){
                    System.out.println("Por favor, responda solo con 'S' o 'N'.");
                }
            }while(!opc1.equalsIgnoreCase("S") && !opc1.equalsIgnoreCase("N"));
        } while (!opc1.equalsIgnoreCase("N"));
        
        int opc2;
        do {            
            System.out.println("********** LIBRERIA **********\n"
                    + "1. Prestar libro\n"
                    + "2. Devolver libro\n"
                    + "3. Mostrar datos\n"
                    + "4. Salir");
            opc2 = leer.nextInt();
            switch (opc2) {
                case 1:
                    //PRESTAMO
                    boolean prestamo = false;
                    boolean bandera = false;
                    System.out.println("");
                    System.out.println("Ingrese titulo del libro a prestar:");
                    String titulo = leer.next();
                    for (Libro aux : libreria) {
                        if(aux.getTitulo().equalsIgnoreCase(titulo)){
                            prestamo = ls.prestamo(aux);
                            bandera = true;
                            break;
                        }
                    }
                    if(bandera == false){
                        System.out.println("");
                        System.out.println("El libro no fue encontrado.");
                        System.out.println("");
                    }else if(prestamo == false){
                        System.out.println("");
                        System.out.println("No quedan ejemplares disponibles para realizar el prestamo.");
                        System.out.println("");
                    }else{
                        System.out.println("");
                        System.out.println("El prestamo se realizó con exito.");
                        System.out.println("");
                    }
                    break;
                case 2:
                    //DEVOLUCION
                    boolean devolucion = false;
                    boolean flag = false;
                    System.out.println("");
                    System.out.println("Ingrese titulo del libro a devolver:");
                    String title = leer.next();
                    for (Libro aux : libreria) {
                        if(aux.getTitulo().equalsIgnoreCase(title)){
                            devolucion = ls.devolucion(libro);
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false){
                        System.out.println("");
                        System.out.println("El libro no fue encontrado.");
                        System.out.println("");
                    }else if(devolucion == false){
                        System.out.println("");
                        System.out.println("No hay ejemplares prestados para devolver.");
                        System.out.println("");
                    }else{
                        System.out.println("");
                        System.out.println("La devolución se realizó con exito.");
                        System.out.println("");
                    }
                    break;
                case 3:
                    //MOSTRAR DATOS
                    boolean band = false;
                    System.out.println("Ingrese libro a mostrar:");
                    String datos = leer.next();
                    for (Libro aux : libreria) {
                        if(aux.getTitulo().equalsIgnoreCase(datos)){
                            System.out.println("");
                            System.out.println(aux.toString());
                            System.out.println("");
                            band = true;
                            break;
                        }
                    }
                    if(band == false){
                        System.out.println("");
                        System.out.println("El libro no fue encontrado.");
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Saliendo del programa...");
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opcion incorrecta. Ingrese de nuevo.");
                    System.out.println("");
            }
        } while (opc2 != 4);
    }
    
}
