/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package ej3;

import Servicio.AlumnoServicio;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio alumServ = new AlumnoServicio();
        String nombre;
        double promedio;
        
        alumServ.crearAlumnos();
        System.out.println("Ingrese nombre del alumno a buscar: ");
        nombre = leer.next();
        promedio = alumServ.notaFinal(nombre);
        if(promedio != 0){
            System.out.println("La nota final de "+nombre+" es: "+promedio);
        }else{
            System.out.println("El alumno no fue encontrado.");
        }
    }
    
}
