package records;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		
		Alumno a = new Alumno("Miguel", "Machuca Martos", 17);
		System.out.println(a);
		System.out.println(Alumno.DOMINIO);
		
		Persona p = new Persona("Manuel", "Sevilla Castillejo", LocalDate.of(1990, 1, 1));
		
		Alumno b = Alumno.of(p);
		System.out.println(b);
		
		
	}

}
