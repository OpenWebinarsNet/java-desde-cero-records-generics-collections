package colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		
		/**************
		 * COMPARABLE
		 **************/
		
		Alumno a1 = new Alumno(123, "José", "Pérez Pérez", 7.6, 14);
		Alumno a2 = new Alumno(234, "María", "García Sainz", 8.7, 15);
		Alumno a3 = new Alumno(345, "Marta", "Martínez Puertas", 8.9, 14);
		
		// Por orden alfabético
		
		if (a1.compareTo(a2) > 0) {
			System.out.println("El alumno %s debe ir antes en la lista".formatted(a2));
		} else {
			System.out.println("El alumno %s debe ir antes en la lista".formatted(a1));
		}
		
		// Comparación como base de la ordenación
		System.out.println();
		
		// Colección "sin orden"
		List<Alumno> lista = new ArrayList<>(List.of(a1, a2, a3));
		System.out.println("Lista en orden de inserción");
		System.out.println(lista);

		// Coleccion con orden según Comparable
		TreeSet<Alumno> alumnos = new TreeSet<>(lista);
		System.out.println("Lista ordenada por apellidos");
		System.out.println(alumnos);
		
		/**************
		 * COMPARATOR
		 **************/
		
		// Coleccion con orden secundario usando comparator
		TreeSet<Alumno> alumnos2 = new TreeSet<>(new ComparatorPorNotaDescendente());
		alumnos2.addAll(lista);
		System.out.println("Lista ordenada por nota descendente");
		System.out.println(alumnos2);
		
		
		
		
		

	}

}
