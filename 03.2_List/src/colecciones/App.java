package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/************************
		 * CREACIÓN DE LISTAS   *
		 ************************/
		
		
		/*
		 * Lista de tamaño fijo. No se pueden añadir ni borrar elementos
		 * Se pueden modificar los elementos contenidos.
		 */
		List<String> lista = Arrays.asList("Uno", "Dos", "Tres");
		
		//lista.add("Cuatro");       // Produce error
		//lista.remove(0);       	 // Produce error
		lista.set(0, "Cero");
		System.out.println(lista);   // Permitida
		
		/*
		 * Lista no modificable. No se puede añadir, borrar o sustituir.
		 * Si los elementos son mutables, se pueden modificar.
		 */
		List<Integer> lista2 = List.of(1,2,3,4);
		
		//lista2.add(5);			// Produce error
		//lista2.remove(0);			// Produce error
		//lista2.set(0,0);			// Produce error
		
		List<Producto> lista22 = List.of(
					new Producto("Bolígrafo", 1.25),
					new Producto("Folios", 3.60)
				);
		
		System.out.println(lista22);
		
		lista22.get(1).precio = 4.5;  // Permitida
		
		System.out.println(lista22);
		
		/*
		 * Lista mutable de tamaño "indefinido"
		 */
		List<Integer> lista3 = new ArrayList<>();
		
		lista3.add(10);
		lista3.add(9);
		lista3.addAll(List.of(8,7,6));
		lista3.add(5);
		
		System.out.println(lista3);
		
		
		/*******************
		 * RECORRER LISTAS *
		 *******************/

		System.out.println();
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println();
		for(int n : lista3) {
			System.out.println(n);
		}
		
		List<Integer> lista4 = new ArrayList<>(List.of(1,10,25,32,45,50));
		
		/*
		 * Vamos a eliminar de la lista aquellos números que acaben en 0 o en 5
		 */
		for(Iterator<Integer> it = lista4.iterator(); it.hasNext(); ) {
			int n = it.next();
			if (n % 10 == 0 || n % 10 == 5)
				it.remove();
		}
		
		System.out.println(lista4);
		
		
		/*********************
		 * ACCESO Y BÚSQUEDA *
		 *********************/
		
		System.out.println();
		int pos = lista.indexOf("Dos");
		System.out.println(pos);

		System.out.println();
		lista4.addAll(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3));
		pos = lista4.lastIndexOf(1);
		System.out.println(lista4);
		System.out.println(pos);
		
		System.out.println();
		boolean contains = lista4.contains(1);
		System.out.println(contains);
		contains = lista4.containsAll(List.of(1,2,3,4));
		System.out.println(contains);
		
		/*************************
		 * TAMAÑO Y MODIFICACIÓN *
		 *************************/
		
		System.out.println();
		lista3.clear();
		boolean empty = lista3.isEmpty();
		System.out.println(empty);
		
		System.out.println();
		lista4.set(0, 12345);
		System.out.println(lista4);
		lista4.removeAll(List.of(1,2,3,4));
		System.out.println(lista4);
		
		/**********************
		 * SUBLISTAS Y ARRAYS *
		 **********************/
		
		System.out.println();
		List<Integer> sublista = lista4.subList(0, 2);
		System.out.println(sublista);
		lista4.set(0, 54321);
		System.out.println(lista4);
		System.out.println(sublista);
		sublista.add(12345);
		System.out.println(lista4);
		System.out.println(sublista);
		
		String[] array = new String[lista.size()];
		array = lista.toArray(array);
		System.out.println(Arrays.toString(array));
		

	}

}
