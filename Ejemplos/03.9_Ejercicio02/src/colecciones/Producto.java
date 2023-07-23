package colecciones;

import java.util.Objects;

public class Producto {
	
	private String nombre;
	private double pvp;
	
	public Producto() {}
	
	public Producto(String nombre, double pvp) {
		this.nombre = nombre;
		this.pvp = pvp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, pvp);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(pvp) == Double.doubleToLongBits(other.pvp);
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", pvp=" + pvp + "]";
	}
	
	
	
	

}
