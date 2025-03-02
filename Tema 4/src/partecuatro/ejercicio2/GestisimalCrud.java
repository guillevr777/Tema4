package partecuatro.ejercicio2;

import java.util.HashSet;
import java.util.Set;

import partecuatro.ejercicio1.Alumno;

public class GestisimalCrud {

		// Atributo que va a ser la coleccion donde almacenar nuestros objetos
		private static Set<Gestisimal> articulos = new HashSet<Gestisimal>();

		public static void listarArticulos() {
			for (Gestisimal a : articulos) {
				System.out.println(a);
			}
		}
		public static alta() {
			
		}
		public static boolean baja(Gestisimal art) {
			return articulos.remove(art);
		}

}
