package colecciones;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

	public static void encontrarParesConSumaBuscada(List<Integer> nums, int objetivo) {
		Set<Integer> numerosVistos = new HashSet<>();
		Set<Par<Integer,Integer>> paresEncontrados = new HashSet<>();
		
		for(int n : nums) {
			int complemento = objetivo - n;
			if (numerosVistos.contains(complemento))
				paresEncontrados.add(Par.of(n, complemento));
			numerosVistos.add(n);
		}
		
		if (paresEncontrados.isEmpty()) {
			System.out.println("No se encontraron pares que sumen %d".formatted(objetivo));
		} else {
			System.out.println("Pares que suman %d".formatted(objetivo));
			for(Par<Integer, Integer> par : paresEncontrados) {
				System.out.println("%d + %d".formatted(par.getPrimerObjeto(), par.getSegundoObjeto()));
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		List<Integer> numeros = List.of(2,4,6,8,10);
		int objtivo = 12;
		encontrarParesConSumaBuscada(numeros, objtivo);

	}
	

}
