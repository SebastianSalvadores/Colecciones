/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Integer> listaNumeros = new ArrayList<>();
        Integer num = 0;
        int suma = 0;
        double prom;
        do {            
            System.out.println("Ingrese un numero entero. (-99 para finalizar):");
            num = leer.nextInt();
            if(num != -99){
                listaNumeros.add(num);
            }
        } while (num != -99);
        
        for (Integer numero : listaNumeros) {
            suma += numero;
        }
        
        prom = (double)suma / listaNumeros.size();
        
        System.out.println("Se han leído "+listaNumeros.size()+" numeros. La sumatoria de todos los numeros de la lista es "+suma+" y su media es "+prom+".");
    }
    
}
