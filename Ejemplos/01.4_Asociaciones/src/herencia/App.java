package herencia;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		Empleado empleado = new Empleado("María", "Martín Martín", LocalDate.of(2020, 1, 1));
		System.out.println(empleado.nombreCompleto());
		
		// Igual que con las clases...
		Nombrable otroEmpleado = new Empleado("Juan", "Martínez Guzmán", LocalDate.of(2021, 2, 3));
		System.out.println(otroEmpleado.nombreCompleto());

	}

}
