package ejercicio;

public class App {

	public static void main(String[] args) {
		TiendaLibros tienda = new TiendaLibros(3);

        tienda.agregarLibro(new Libro("1984", "George Orwell", Genero.FICCION, 19.99));
        tienda.agregarLibro(new Libro("Sapiens", "Yuval Noah Harari", Genero.NO_FICCION, 24.99));
        tienda.agregarLibro(new Libro("El origen de las especies", "Charles Darwin", Genero.CIENCIA, 29.99));

        tienda.mostrarLibros();

        Genero generoBusqueda = Genero.FICCION;
        tienda.mostrarLibrosPorGenero(generoBusqueda);
	}

}
