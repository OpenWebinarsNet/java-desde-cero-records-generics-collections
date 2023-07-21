package ejemplo1;

public class App {

	public static void main(String[] args) {
		
		Object[] array = new Object[4];
		
		array[0] = new A("Hola");
		array[1] = new A("Mundo");
		array[2] = new B(3.0);
		array[3] = new B(2.67);
		
		for(Object o : array) 
			System.out.println(o);
		
	}

}
