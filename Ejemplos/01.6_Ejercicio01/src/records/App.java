package records;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		ListaTareas lista = new ListaTareas(3);

        lista.agregarTarea(new Tarea("Tarea 1", "Realizar informe", LocalDate.of(2023, 6, 30)));
        lista.agregarTarea(new Tarea("Tarea 2", "Preparar presentación", LocalDate.of(2023, 7, 5)));
        lista.agregarTarea(new Tarea("Tarea 3", "Enviar correo de seguimiento", LocalDate.of(2023, 7, 10)));

        lista.mostrarTareas();

        LocalDate fechaBusqueda = LocalDate.of(2023, 7, 5);
        lista.mostrarTareasPorFecha(fechaBusqueda);
	}
	
	
}
