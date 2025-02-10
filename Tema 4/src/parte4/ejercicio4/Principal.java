package parte4.ejercicio4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int cantidad;
        String nombre;
        double IVA;
        double precio;

        // Asignamos valores al artículo
        cantidad = 13;
        nombre = "PremierDelux";
        IVA = 21;
        precio = 356.0;

        // Creamos un objeto de la clase Articulo
        Articulo sofa = new Articulo(nombre, precio, IVA, cantidad);

        System.out.println(sofa.toString());

        // Preguntamos por más stock
        System.out.println("¿Quieres añadir más stock? Actualmente hay " + sofa.getCantidad() + " unidades.");
        try {
            int stockAdicional = reader.nextInt();
            sofa.almacenar(stockAdicional);
        } catch (Exception e) {
            System.out.println("Entrada no válida. No se añadirá stock.");
        }

        // Aplicamos un descuento
        System.out.println("Introduce el porcentaje de descuento (0-100):");
        try {
            int descuento = reader.nextInt();
            double precioConDescuento = sofa.getPVPDescuento(descuento);
            System.out.println("El precio con el descuento aplicado es: " + precioConDescuento);
        } catch (Exception e) {
            System.out.println("Entrada no válida. No se aplicará ningún descuento.");
        }

        System.out.println(sofa.toString());

        reader.close();
    }
}