package genericos;

public class App {

	public static void main(String[] args) {

		Pila<Integer> pila = new Pila<>();
		
		pila.push(10);
		pila.push(7);
		pila.push(12);
		pila.push(4);
		
		int n = pila.pop();
		
		System.out.println(pila);
		
	}

}
