package partecuatro.ejercicio4;

import java.util.HashSet;
import java.util.Set;

import partecuatro.ejercicio1.Alumno;
import partecuatro.ejercicio3.Pizza;
import partecuatro.ejercicio4.Disco;
import partecuatro.ejercicio4.Principal;

public class DiscoCrud {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private static Set<Disco> discos = new HashSet<Disco>();
		
	static void listado () {
		for (Disco d : discos) {
			System.out.println(d);
			System.out.println("------------");
		}
	}
	
	//preguntar si tiene que ser void o boolean
	static void listarDisco (int codigo, String autor, String titulo) {
		Disco disco = new Disco(codigo, autor, titulo);
		if (discos.add(disco)) {
			System.out.println("Creado exitosamente.");
		} else {			
			System.out.println("Ocurrio un problema con su solicitud.");
		}
	}
	
	public static Disco buscaDisco(int codigo) {
		
		Disco disco = null;
		
		for (Disco d : discos) {
			if (d.getCodigo() == codigo) {
				disco = d;
			}
		}
		return disco;
	} 

	public static boolean borrarDisco(Disco disco) {
		return discos.remove(disco);
	}

//	static boolean borrarDisco (int codigo) {
//		Disco disco = buscaDisco (codigo);
//		if (disco != null) {
//			Disco.remove(disco);
//		}
//	}
}
