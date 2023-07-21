package ejercicio;

public class TiendaLibros {
	private Libro[] libros;
	private int cantidadLibros;

	public TiendaLibros(int capacidad) {
		libros = new Libro[capacidad];
		cantidadLibros = 0;
	}

	public void agregarLibro(Libro libro) {
		if (cantidadLibros < libros.length) {
			libros[cantidadLibros] = libro;
			cantidadLibros++;
		} else {
			System.out.println("La tienda de libros está llena. No se puede agregar más libros.");
		}
	}

	public void mostrarLibros() {
		System.out.println("Todos los libros:");
		for (int i = 0; i < cantidadLibros; i++) {
			System.out.println(libros[i]);
		}
	}

	public void mostrarLibrosPorGenero(Genero generoBusqueda) {
		System.out.println("Libros del género " + generoBusqueda + ":");
		for (int i = 0; i < cantidadLibros; i++) {
			if (libros[i].genero() == generoBusqueda) {
				System.out.println(libros[i]);
			}
		}
	}
}
