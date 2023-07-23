package genericos;

import java.util.List;

public class ClaseSinGenericos {

	public void imprimirListaEntero(List<Integer> listaEntero) {
		for (int i : listaEntero)
			System.out.println(i);
	}

	public void imprimirListaCadena(List<String> listaCadenas) {
		for (String s : listaCadenas)
			System.out.println(s);
	}

}
