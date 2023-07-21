package records;

import java.util.Objects;

public record Alumno(String nombre, String apellidos, String email, int edad) {
	public Alumno {
		Objects.requireNonNull(nombre);
		Objects.requireNonNull(apellidos);
	}
	
	public Alumno(String nombre, String apellidos, int edad) {
		this(nombre, apellidos, nombre.toLowerCase() + "." + apellidos.toLowerCase() + "@ow.net", edad);
	}
	
	public String nombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}

}
