package genericos;

import java.util.List;

public class ClaseConGenericos<T> {

	public void imprimirLista(List<T> lista) {
		for (T t : lista)
			System.out.println(t);
	}

}
