package ejemplo2;

import ejemplo1.A;
import ejemplo1.B;

public class App {

	public static void main(String[] args) {
		
		A a = new A("Hola");
		B b = new B(3.14);
		
		Box contenedor1 = new Box(a);
		Box contenedor2 = new Box(b);
		Box contenedor3 = Box.EMPTY;

	}

}
