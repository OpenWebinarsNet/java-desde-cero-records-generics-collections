package records;

import java.time.LocalDate;

public class ListaTareas {
    private Tarea[] listaTareas;
    private int cantidadTareas;

    public ListaTareas(int capacidad) {
        listaTareas = new Tarea[capacidad];
        cantidadTareas = 0;
    }

    public void agregarTarea(Tarea tarea) {
        if (cantidadTareas < listaTareas.length) {
            listaTareas[cantidadTareas] = tarea;
            cantidadTareas++;
        } else {
            System.out.println("La lista de tareas está llena. No se puede agregar más tareas.");
        }
    }

    public void mostrarTareas() {
        System.out.println("Todas las tareas:");
        for (int i = 0; i < cantidadTareas; i++) {
            System.out.println(listaTareas[i]);
        }
    }

    public void mostrarTareasPorFecha(LocalDate fechaBusqueda) {
        System.out.println("Tareas que vencen el " + fechaBusqueda + ":");
        for (int i = 0; i < cantidadTareas; i++) {
            if (listaTareas[i].fechaVencimiento().equals(fechaBusqueda)) {
                System.out.println(listaTareas[i]);
            }
        }
    }
}
