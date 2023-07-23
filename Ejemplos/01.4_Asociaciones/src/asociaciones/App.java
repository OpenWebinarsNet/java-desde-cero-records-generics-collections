package asociaciones;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		
		Empresa emp = new Empresa("Microsoft", new Empleado[]{
			new Empleado("Bill", "Gates", LocalDate.of(1975, 4, 4)),
			new Empleado("Paul", "Allen", LocalDate.of(1975, 4, 4))
		});
		
		System.out.println(emp);
		

	}

}
