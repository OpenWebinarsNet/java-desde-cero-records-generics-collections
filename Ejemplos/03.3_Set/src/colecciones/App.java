package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {

		Set<String> set1 = Set.of("Uno","Dos","Tres");
		
		/*
		 * Cabe la posibilidad de que en diferentes accesos
		 * se nos devuelvan los elementos en diferente orden.
		 */
		for(String s : set1) {
			System.out.println(s);
		}
		
		System.out.println();
		for(Iterator<String> it = set1.iterator(); it.hasNext();) {
			String s = it.next();
			System.out.println(s);
		}
		
		
		/***************
		 *   HASHSET   *
		 ***************/
		
		// Eficiente, sin orden, sin repetidos
		
		Set<Alumno> set2 = new HashSet<>();
		
		set2.add(new Alumno("123456", "María", "Pérez García"));
		set2.add(new Alumno("234567", "Juan", "Ropa Muñoz"));
		set2.add(new Alumno("345678", "Julia", "Martínez Luján"));
		set2.add(new Alumno("345678", "Julia", "Martínez Luján")); // Repetido, no lo inserta. Size = 3
		
		System.out.println();
		for(Alumno a : set2) {
			System.out.println(a);
		}
		
		
		/*****************
		 * LINKEDHASHSET *
		 *****************/
		
		// Mantiene orden de inserción
		
		Set<Alumno> set3 = new LinkedHashSet<>(set2);
		
		set3.add(new Alumno("98765", "Miguel", "De la Rosa Villar"));
		
		System.out.println();
		for(Alumno a : set3) {
			System.out.println(a);
		}
		
		// Mismo orden otra vez
		System.out.println();
		for(Alumno a : set3) {
			System.out.println(a);
		}
		
		
		/***************
		 *   TREESET   *
		 ***************/
		
		// Usamos TreeSet como tipo de dato de la referencia
		
		TreeSet<Integer> set4 = new TreeSet<>();
		
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			set4.add(r.nextInt(100));
		}
		
		// Iteramos en orden ascendente
		System.out.println();
		for(int i : set4) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		
		// Iteramos en orden descendente
		for(int i: set4.descendingSet()) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// Podemos obtener una vista acotada del TreeSet
		Set<Integer> subSet4 = set4.subSet(25, 75);
		for(int i : subSet4) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		
		
	}

}
