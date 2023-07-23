package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		
		// Lista vacía e inmutable
		List<Integer> listaVacia = Collections.emptyList();
		
		List<Integer> lista = new ArrayList<>();
		lista.addAll(List.of(1,2,3,4,5));
		
		// Vista inmutable de la lista anterior
		List<Integer> vistaInmutable = Collections.unmodifiableList(lista);
		
		// La lista subyacente se puede modificar.
		lista.add(6);
		
		// Los cambios de la lista subyacente se propagan a la lista
		// No a la inversa, puesto que la vista es no modificable
		System.out.println(vistaInmutable);
		
		
		// Búsqueda
		List<Integer> numeros = new ArrayList<>();
		Random r = new Random();
		for(int i = 0; i < 100; i++) {
			numeros.add(r.nextInt(1000));
		}
		Collections.sort(numeros);
		int pos = Collections.binarySearch(numeros, 123);
		
		System.out.println(numeros);
		
		if (pos > 0)
			System.out.println("Encontrado!");
		else
			System.out.println("No encontrado :(");
		
		
		List<Integer> numeros2 = List.of(1,2,3,4,5,6,1,2,3,4,5,6);
		
		pos = Collections.indexOfSubList(numeros2, List.of(2,3,4));
		
		System.out.println(numeros2);
		System.out.println(pos);
		
		pos = Collections.lastIndexOfSubList(numeros2, List.of(3,4,5));
		System.out.println(pos);
		
		// Modificar
		List<Integer> numeros3 = new ArrayList<>(numeros2);
		Collections.shuffle(numeros3);
		System.out.println(numeros3);
		
		Collections.swap(numeros3, 0, numeros3.size()-1);
		System.out.println(numeros3);
		
		List<String> saludos = Collections.nCopies(10, "Hola");
		System.out.println(saludos);
		
		List<String> saludos2 = new ArrayList<>(); 
		saludos2.addAll(Collections.nCopies(11, "Adios"));
		Collections.copy(saludos2, saludos);
		System.out.println(saludos2);
		
		Collections.addAll(numeros3, 7,8,9);
		System.out.println(numeros3);
		
		// Descriptores estadisticos
		int freq = Collections.frequency(numeros3, 1);
		System.out.println("El número 1 se ha encontrado %d veces".formatted(freq));
	
		int max = Collections.max(numeros);
		System.out.println("El máximo de la colección es %d".formatted(max));
		
		
		
		
		
		
		
		
		

	}

}
