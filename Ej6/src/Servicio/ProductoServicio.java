/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class ProductoServicio {
    private Scanner leer;
    private HashMap<String, Double> productos;

    public ProductoServicio() {
        leer = new Scanner(System.in).useDelimiter("\n");
        productos = new HashMap();
    }
    
    public void menu(){
        int opc;
        do {            
            
            System.out.println("--------- MENU PRINCIPAL ---------\n"
                    + "1. Introducir un nuevo producto\n"
                    + "2. Modificar precio\n"
                    + "3. Eliminar producto\n"
                    + "4. Mostrar productos\n"
                    + "5. Salir\n"
                    + "\n"
                    + "Ingrese numero de opción:");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Opcion incorrecta");
                    System.out.println("");
            }
        } while(opc != 5);
    }
    
    public void crearProducto(){
        String llave;
        Double valor;
        System.out.println("Ingrese nombre del producto: ");
        llave = leer.next();
        System.out.println("Ingrese precio del producto: ");
        valor = leer.nextDouble();
        productos.put(llave, valor);
        System.out.println("");
        System.out.println("El producto fue creado.");
        System.out.println("");
    }
    
    public void modificarPrecio(){
        String buscar;
        Double nuevoPrecio;
        System.out.println("Ingrese producto a modificar precio: ");
        buscar = leer.next();
        if(productos.containsKey(buscar)){
            System.out.println("Ingrese nuevo precio: ");
            nuevoPrecio = leer.nextDouble();
            productos.put(buscar, nuevoPrecio);
            System.out.println("");
            System.out.println("El precio fue modificado.");
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("No se encontró el producto.");
            System.out.println("");
        }
    }
    
    public void eliminarProducto(){
        String buscar;
        System.out.println("Ingrese producto a eliminar: ");
        buscar = leer.next();
        if(productos.containsKey(buscar)){
            productos.remove(buscar);
            System.out.println("");
            System.out.println("El producto fue eliminado.");
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("No se encontró el producto.");
            System.out.println("");
        }
    }
    
    public void mostrarProductos(){
        System.out.println("");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("Producto = "+entry.getKey()+", Precio = "+entry.getValue());
        }
        System.out.println("");
    }
}
