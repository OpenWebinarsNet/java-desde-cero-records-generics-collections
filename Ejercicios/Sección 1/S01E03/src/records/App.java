package records;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Producto producto1 = new Producto(1, "Producto 1", "Descripción 1", 10.0);
        Producto producto2 = new Producto(2, "Producto 2", "Descripción 2", 20.0);

        LocalDate fechaInicio = LocalDate.of(2023, 6, 1);
        LocalDate fechaFin = LocalDate.of(2023, 6, 30);

        OfertaProducto ofertaProducto1 = OfertaProducto.of(producto1, 8.0, fechaInicio, fechaFin);
        OfertaProducto ofertaProducto2 = OfertaProducto.of(producto2, 15.0, fechaInicio, fechaFin);

        System.out.println("Producto 1: " + producto1.getNombre() + ", Precio: " + producto1.getPrecio());
        System.out.println("Oferta Producto 1: " + ofertaProducto1.nombre() + ", Precio de oferta: " + ofertaProducto1.precioOferta());
        System.out.println("Producto 2: " + producto2.getNombre() + ", Precio: " + producto2.getPrecio());
        System.out.println("Oferta Producto 2: " + ofertaProducto2.nombre() + ", Precio de oferta: " + ofertaProducto2.precioOferta());
    }
}
