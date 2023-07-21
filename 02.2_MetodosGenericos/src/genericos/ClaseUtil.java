package genericos;

import java.util.List;

public class ClaseUtil {
	
	public static <T> void imprimirLista(List<T> lista) {
		for(T t: lista)
			System.out.println(t);
	}

}
