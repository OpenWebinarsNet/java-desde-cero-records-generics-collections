package genericos;

import java.util.List;

public class App {

	public static void main(String[] args) {
		ListaEntera listaEntera = new ListaEntera(5);
		List lista = listaEntera;
		lista.add("hola");
		Integer i = listaEntera.get(0);
	}

}
