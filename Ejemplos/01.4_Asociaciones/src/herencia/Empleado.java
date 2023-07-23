package herencia;

import java.time.LocalDate;

public record Empleado(String nombre, String apellidos, LocalDate fechaContratacion) implements Nombrable {

	@Override
	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}

}
