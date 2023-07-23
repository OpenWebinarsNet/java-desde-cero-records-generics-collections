package records;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record Alumno(String nombre, String apellidos, String email, int edad) {
	
	public static final String DOMINIO = "@openwebinars.net";
	
	public Alumno(String nombre, String apellidos, int edad) {
		this(nombre, 
				apellidos, 
				(nombre.toLowerCase() + "." + apellidos.toLowerCase()).replaceAll("\\s", "") + DOMINIO, 
				edad);
	}
	
	public static Alumno of(Persona p) {
		int edad = (int) ChronoUnit.YEARS.between(p.getFechaNacimiento(), LocalDate.now());
		return new Alumno(p.getNombre(), p.getApellidos(), edad);
	}
	

}
