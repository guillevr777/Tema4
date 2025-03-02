package partecuatro.ejercicio2;

import java.util.HashSet;
import java.util.Set;

import partecuatro.ejercicio2.Gestisimal;
import partecuatro.ejercicio2.Principal;

public class GestisimalCrud {

		// Atributo que va a ser la coleccion donde almacenar nuestros objetos
		private static Set<Gestisimal> articulos = new HashSet<Gestisimal>();

		public static void listarArticulos() {
			for (Gestisimal art : articulos) {
				System.out.println(art);
				System.out.println("----------");
			}
		}
		
		public static boolean añadeArticulo(Gestisimal a) {

		return articulos.add(a);
	}

		public static boolean baja(Gestisimal art) {
			return articulos.remove(art);
		}

		public static Gestisimal buscaArticulo(String nombre) {
			
			Gestisimal articulo = null;
			
			for (Gestisimal a : articulos) {
				if (a.getNombre().equals(nombre)) {
					articulo = a;
				}
			}
			return articulo;
		} 
		
		public static boolean modificarPrecio(String nombre, double precio) {

			boolean sePudo = false;

			Gestisimal articulo = buscaArticulo(nombre);
			if (articulo != null) {
				articulo.setPrecio(precio);
				sePudo = true;
			}

			return sePudo;

		}
		
		public static boolean añadirMercancia(String nombre, int cantidad) {
			
			boolean sePudo = false;
			
			Gestisimal articulo = buscaArticulo(nombre);
			if (articulo != null) {
				articulo.setCantidad(articulo.getCantidad() + cantidad);
				sePudo = true;
			}
			
			return sePudo;
		}
		
		public static boolean eliminarMercancia(String nombre, int cantidad) {
			
			boolean sePudo = false;
			
			Gestisimal articulo = buscaArticulo(nombre);
			if (articulo != null) {
				articulo.setCantidad(articulo.getCantidad() - cantidad);
				sePudo = true;
			}
			
			return sePudo;
		}
}
