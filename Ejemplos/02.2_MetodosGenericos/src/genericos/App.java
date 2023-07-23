package genericos;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<Integer> enteros = List.of(1,2,3,4,5);
		List<String> quijote = List.of("En","un","lugar","de","la","Mancha");
		
		ClaseSinGenericos claseSinGenericos = new ClaseSinGenericos();
		
		claseSinGenericos.imprimirListaCadena(quijote);
		claseSinGenericos.imprimirListaEntero(enteros);
		
		ClaseConGenericos<String> claseConGenericos = new ClaseConGenericos<>();
		
		claseConGenericos.imprimirLista(quijote);
		
		ClaseUtil.imprimirLista(enteros);
		ClaseUtil.imprimirLista(quijote);
		

	}
	
	

}
