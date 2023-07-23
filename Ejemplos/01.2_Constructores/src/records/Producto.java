package records;

public record Producto(long codigo, String nombre, double precio) {
	public Producto(long codigo, String nombre, double precio) {
		// También podemos validar
		this.codigo = codigo;
		this.nombre = nombre.trim().toUpperCase();
		this.precio = precio;
		
	}

}
