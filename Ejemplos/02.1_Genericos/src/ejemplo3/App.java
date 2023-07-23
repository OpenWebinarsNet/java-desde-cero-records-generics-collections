package ejemplo3;

import ejemplo1.A;
import ejemplo1.B;

public class App {

	public static void main(String[] args) {

		A a = new A("Hola");
		B b = new B(3.14);
		
		Box<A> contenedor1 = new Box<>(a);
		Box<B> contenedor2 = new Box<>(b);
		Box<?> contenedor3 = Box.EMPTY;
		
		Box<?>[] array = new Box[] {contenedor1, contenedor2, contenedor3};
		
		for(Box<?> box : array) {
			if (!box.isEmpty())
				System.out.println(box.getValue());
		}
		
		
		Box<Integer> contenedor4 = new Box<>(5);
		Box<String> contenedor5 = new Box<>("Hola Mundo");
		Box<Double> contenedor6 = new Box<>(3.14);
		
		
	}

}
