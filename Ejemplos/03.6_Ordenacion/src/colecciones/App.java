package colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		
		// Arrays
		
		int[] intArray = new int[100];
		
		Random r = new Random();
		for(int i = 0; i < 100; i++) {
			intArray[i] = r.nextInt(1000);
		}
		
		// Ordenación parcial
		Arrays.sort(intArray, 0, 10);
		System.out.println(Arrays.toString(intArray));
		
		
		
		// Se ordena el array que se pasa como argumento
		// Es decir, se modifica el original
		Arrays.sort(intArray);
		
		System.out.println(Arrays.toString(intArray));
		
		
		// Si se quiere usar la versión con comparator
		// deben ser objetos ya que se usan genéricos
		Integer[] intArray2 = new Integer[100];
		for(int i = 0; i < 100; i++) {
			intArray2[i] = Integer.valueOf(intArray[i]);
		}
		Arrays.sort(intArray2, Comparator.reverseOrder()); // Orden inverso al orden natural
		System.out.println(Arrays.toString(intArray2));
		
		
		// Colecciones de tipo List
		System.out.println();
		
		
		Alumno a1 = new Alumno(123, "José", "Pérez Pérez", 7.6, 14);
		Alumno a2 = new Alumno(234, "María", "García Sainz", 8.7, 15);
		Alumno a3 = new Alumno(345, "Marta", "Martínez Puertas", 8.9, 14);

		List<Alumno> lista = new ArrayList<>(List.of(a1, a2, a3));

		// Orden "natural"
		Collections.sort(lista);
		System.out.println(lista);

		// Orden secundario
		Collections.sort(lista, new ComparatorPorNotaDescendente());
		System.out.println(lista);
		
		// Otro tipo de colecciones
		Set<Integer> setSinOrden = Set.of(1,3,4,2);
		Set<Integer> setConOrden = new TreeSet<>(setSinOrden);
		
		Set<Integer> setConOtroOrden = new TreeSet<>(Comparator.reverseOrder());
		setConOtroOrden.addAll(setSinOrden);
		
		
		

	}

}
