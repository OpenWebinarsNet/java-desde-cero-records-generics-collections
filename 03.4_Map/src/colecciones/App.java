package colecciones;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class App {

	public static void main(String[] args) {

		Map<Integer, String> map1 = Map.of(1, "Uno", 2, "Dos", 3, "Tres");

		Map<Integer, String> map2 = Map.ofEntries(Map.entry(1, "Uno"), Map.entry(2, "Dos"), Map.entry(3, "Tres"));

		Map<Integer, String> map3 = new HashMap<>();
		map3.put(1, "Uno");
		map3.put(2, "Dos");
		map3.put(3, "Tres");

		System.out.println(map3.get(3));
		System.out.println(map3.get(4));
		System.out.println(map3.getOrDefault(4, "Cuatro"));

		System.out.println();
		for (int n : map3.keySet()) {
			System.out.println("%d %s".formatted(n, map3.get(n)));
		}

		if (!map3.containsKey(4))
			map3.put(4, "Cuatro");

		map3.replace(3, "TRES");

		map3.remove(1, "Dos"); // No elimina porque no existe esta asociación

		System.out.println();
		for (int n : map3.keySet()) {
			System.out.println("%d %s".formatted(n, map3.get(n)));
		}

		// LinkedHashMap

		LinkedHashMap<String, String> linked = new LinkedHashMap<>();
		linked.put("1", "Uno");
		linked.put("2", "Dos");
		linked.put("3", "Tres");

		// Se garantiza el orden de inserción
		System.out.println();
		for (String s : linked.keySet())
			System.out.println("%s %s".formatted(s, linked.get(s)));

		// TreeMap

		// Vamos a crear un Map que albergue algunos números
		// aleatorios y su cuadrado
		System.out.println();

		TreeMap<Integer, Integer> cuadrados = new TreeMap<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int n = r.nextInt(100);
			cuadrados.put(n, n * n);
		}

		// Primer par
		Map.Entry<Integer, Integer> menor = cuadrados.firstEntry();
		System.out.println("%d %d".formatted(menor.getKey(), menor.getValue()));

		// Clave de mayores que 50
		int mayorQueValor = cuadrados.floorKey(50);
		System.out.println("%d %d".formatted(mayorQueValor, cuadrados.get(mayorQueValor)));

		// Iteramos en orden ascendente
		System.out.println();
		for (int n : cuadrados.keySet()) {
			System.out.println("%d %d".formatted(n, cuadrados.get(n)));
		}

		// Y ahora descendente
		// Iteramos en orden ascendente
		System.out.println();
		for (int n : cuadrados.descendingKeySet()) {
			System.out.println("%d %d".formatted(n, cuadrados.get(n)));
		}

	}

}
