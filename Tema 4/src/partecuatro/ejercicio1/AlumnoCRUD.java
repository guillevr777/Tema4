package partecuatro.ejercicio1;

import java.util.HashSet;
import java.util.Set;

import partecuatro.ejercicio2.Gestisimal;

public class AlumnoCRUD {

	// Atributo que va a ser la coleccion donde almacenar nuestros objetos
	private static Set<Alumno> alumnos = new HashSet<Alumno>();

	public static void listarAlumnos() {
		for (Alumno a : alumnos) {
			System.out.println(a);
		}
	}

	public static boolean añadeAlumno(Alumno a) {

		return alumnos.add(a);
	}

	public static Alumno buscaAlumno(String nombre) {

		Alumno a = null;

		for (Alumno aBusqueda : alumnos) {
			if (aBusqueda.getNombre().equals(nombre)) {
				a = aBusqueda;
			}
		}
		return a;
	}

	public static boolean borrarAlumno(Alumno alum) {
		return alumnos.remove(alum);
	}

	public static boolean modificarMedia(String nombre, double media) {

		boolean sePudo = false;

		Alumno a = buscaAlumno(nombre);
		if (a != null) {
			a.setMedia(media);
			sePudo = true;
		}

		return sePudo;

	}
}