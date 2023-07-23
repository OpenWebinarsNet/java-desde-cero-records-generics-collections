package asociaciones;

import java.util.Arrays;

public record Empresa(String nombre, Empleado[] empleados) {

	@Override
	public String toString() {
		return "Empresa[nombre="+this.nombre+", empleados=[" + Arrays.toString(empleados) + "]";
	}
	
	

}
