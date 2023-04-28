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
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class AlumnoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumnos;

    public AlumnoServicio() {
        this.alumnos = new ArrayList();
    }
    
    public void crearAlumnos(){
        String opc = "";
        do {            
            Alumno alumni = new Alumno();
            System.out.println("Ingrese nombre del alumno:");
            alumni.setNombre(leer.next());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese nota "+(i+1)+" del alumno "+alumni.getNombre());
                alumni.getNotas().add(leer.nextInt());
            }
            alumnos.add(alumni);
            do {                
                System.out.println("¿Desea crear otro alumno? (S/N)");
                opc = leer.next();
            } while (!opc.equalsIgnoreCase("S") && !opc.equalsIgnoreCase("N"));
        } while (!opc.equalsIgnoreCase("N"));
    }
    
    public double notaFinal(String nombre){
        double prom = 0;
        for (Alumno alumno : alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                for (Integer nota : alumno.getNotas()) {
                    prom += nota;
                }
                prom /= 3;
            }
        }
        
        return prom;
    }
    
}
