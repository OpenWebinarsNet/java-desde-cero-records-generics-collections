package colecciones;

import java.util.Objects;

public class Alumno implements Comparable<Alumno>{
	
	
	private int idAlumno;
	private String nombre, apellidos;
	private double notaMedia;
	private int edad;
	
	public Alumno(int idAlumno, String nombre, String apellidos, double notaMedia, int edad) {
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaMedia = notaMedia;
		this.edad = edad;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, edad, idAlumno, nombre, notaMedia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(apellidos, other.apellidos) && edad == other.edad && idAlumno == other.idAlumno
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(notaMedia) == Double.doubleToLongBits(other.notaMedia);
	}

	@Override
	public String toString() {
		return "Alumno [idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellidos=" + apellidos + ", notaMedia="
				+ notaMedia + ", edad=" + edad + "]";
	}

	// El orden natural de un alumno será por apellidos.
	@Override
	public int compareTo(Alumno o) {
		// Basamos el método de Alumno en la implementación
		// de compareTo de String
		return apellidos.compareTo(o.apellidos);
	}

	
	
	

}
