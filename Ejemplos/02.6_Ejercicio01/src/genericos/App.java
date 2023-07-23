package genericos;

public class App {

	public static void main(String[] args) {
		Par<Integer, String> par = new Par<>(10, "Hola");
		System.out.println(par); 

		
		Par<Integer, String> otro = Par.of(20, "Hasta luego");
		System.out.println(otro); 

	}

}
