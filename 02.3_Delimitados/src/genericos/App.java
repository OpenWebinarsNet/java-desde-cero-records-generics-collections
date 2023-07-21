package genericos;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		// Error
		// MathListUtils<String> mathListUtilString = new MathListUtils<>();
		
		MathListUtils<Integer> mathListUtilInteger = new MathListUtils<>();
		
		List<Integer> listaEntera = List.of(1,2,3,4,5);
		
		double resultado = mathListUtilInteger.suma(listaEntera);
		
		System.out.println(resultado);
		
		List<Double> listaReal = List.of(1.2,2.67,3.14,5.15);
		

		MathListUtils<Double> mathListUtilDouble = new MathListUtils<>();
		
		resultado = mathListUtilDouble.suma(listaReal);
		
		System.out.println(resultado);
		
		
		// Error
		// MultipleBounds.max("A", "B", "C");
		
		
		System.out.println(MultipleBounds.max(1, 2, 3));
		

	}

}
