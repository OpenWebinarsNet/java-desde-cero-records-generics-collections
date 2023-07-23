package genericos;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		List<String> l1 = List.of("En","un","lugar","de","la","Mancha");
		
		// Lo creamos de esta forma para que la lista l2 pueda ser modificable.
		List<Integer> l2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
		
		
		ProcesaListas.imprimeLista(l1);
		ProcesaListas.imprimeLista(l2);
		
		// Error
		// ProcesaListas.imprimeListav2(l1);
		ProcesaListas.imprimeListav2(l2);
				
		ProcesaListas.addNumeros(l2);
		ProcesaListas.imprimeListav2(l2);
		
		

	}

}
