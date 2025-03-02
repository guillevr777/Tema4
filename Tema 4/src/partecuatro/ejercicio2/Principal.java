package partecuatro.ejercicio2;

import java.util.Scanner;

import partecuatro.ejercicio2.Gestisimal;
import partecuatro.ejercicio2.GestisimalCrud;

public class Principal {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {

        //declaramos las variables
        int cantidad;
        String nombre;
        double IVA;
        double precio;
        int opc;
        Gestisimal articulo;
        
        // Asignamos valores al artículo
        cantidad = 13;
        nombre = "PremierDelux";
        IVA = 21;
        precio = 356.0;

        // Creamos un objeto de la clase Articulo
        Gestisimal sofa = new Gestisimal(nombre, precio, IVA, cantidad);
        Gestisimal silla = new Gestisimal("Silleitor", 122.0, 11, 4);
        
        GestisimalCrud.añadeArticulo(sofa);
        GestisimalCrud.añadeArticulo(silla);
        
        //Creamos el menu y lo metemos en un bucle while
        do {
        	
        	//Le mostramos al usuario las opciones disponibles
            menu();
            opc = reader.nextInt();
            reader.nextLine();
            
            //Hacemos un switch case para seleccionar la accion correspondiente
            switch (opc) {
            
            case 1 -> {
            	GestisimalCrud.listarArticulos();
            }
            case 2 -> {
            	articulo = crearArticulo();
            	GestisimalCrud.añadeArticulo(articulo);
            }
            case 3 -> {
            	System.out.println("Dime el nombre del articulo a eliminar");
            	nombre = reader.nextLine();
				articulo = GestisimalCrud.buscaArticulo(nombre);
				if (articulo != null) {
					GestisimalCrud.baja(articulo);
				} else {
					System.out.println("El articulo no existe");
				}
            }
            case 4 -> {
            	System.out.println("Dime el nombre del articulo");
            	nombre = reader.nextLine();
            	
            	System.out.println("Y a que precio quieres ponerlo?");
            	precio = reader.nextInt();
            	
            	if (GestisimalCrud.modificarPrecio(nombre, precio)) {
            		System.out.println("Se modifico correctamente!");
            	} else {
            		System.out.println("El nombre proporcionado no era valido");
            	}
            }
            case 5 -> {
            	System.out.println("Dime el articulo a modificar");
            	nombre = reader.nextLine();
            	
            	System.out.println("Dime la cantidad de stock que deseas añadir");
            	cantidad = reader.nextInt();
            	
            	if (GestisimalCrud.añadirMercancia(nombre, cantidad)) {
            		System.out.println("Operacion exitosa");
            	} else {
            		System.out.println("No se pudo realizar la operacion");
            	}
            }
            case 6 -> {
            	System.out.println("Dime el articulo a modificar");
            	nombre = reader.nextLine();
            	
            	System.out.println("Dime la cantidad de stock que deseas eliminar");
            	cantidad = reader.nextInt();
            	
            	if (GestisimalCrud.eliminarMercancia(nombre, cantidad)) {
            		System.out.println("Operacion exitosa");
            	} else {
            		System.out.println("No se pudo realizar la operacion");
            	}
            }
            case 7 -> {
            	System.out.println("Cerrando el programa...");
            }
            }
        	
        } while ((opc != 7));
        
        //cerramos el escaner
        reader.close();
    }
    
    static void menu() {
    	System.out.println("1.Listado\n"
    					 + "2.Alta\n"
    					 + "3.Baja\n"
    					 + "4.Modificacion\n"
    					 + "5.Entrada de mercancia\n"
    					 + "6.Salida de mercancia\n"
    					 + "7.Salir");
    }
    
    static Gestisimal crearArticulo() {
    	
    	String nombre;

		int cantidad;

		Gestisimal art;

		System.out.println("Dime el nombre del articulo");
		nombre = reader.nextLine();

		System.out.println("Digame la cantidad");
		cantidad = reader.nextInt();

		art = new Gestisimal(nombre, cantidad);

		return art;
    }
 }