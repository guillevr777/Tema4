package partecuatro.ejercicio2;

import java.util.Scanner;

import parte4.ejercicio4.Articulo;

public class Principal {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        //declaramos las variables
        int cantidad;
        String nombre;
        double IVA;
        double precio;
        int opc;

        // Asignamos valores al artículo
        cantidad = 13;
        nombre = "PremierDelux";
        IVA = 21;
        precio = 356.0;

        // Creamos un objeto de la clase Articulo
        Articulo sofa = new Articulo(nombre, precio, IVA, cantidad);
        Articulo silla = new Articulo("Silleitor", 122.0, 11, 4);
        
        //Creamos el menu y lo metemos en un bucle while
        do {
        	
        	//Le mostramos al usuario las opciones disponibles
            menu();
            opc = reader.nextInt();
            
            //Hacemos un switch case para seleccionar la accion correspondiente
            switch (opc) {
            
            case 1 -> {
            	GestisimalCrud.listarArticulos();
            }
            case 2 -> {
            	
            }
            case 3 -> {
            	System.out.println("Que articulo quieres eliminar?");
            	String nombre = reader.nextLine();
            	GestisimalCrud.baja(nombre);
            }
            }
        	
        } while ((opc != 7));
        
        //cerramos el escaner
        reader.close();
    }
    
    private static void menu() {
    	System.out.println("A.Listado\n"
    					 + "B.Alta\n"
    					 + "C.Baja\n"
    					 + "D.Modificacion\n"
    					 + "E.Entrada de mercancia\n"
    					 + "F.Salida de mercancia\n"
    					 + "G.Salir");
    }
}