package records;

import java.time.LocalDate;

public record OfertaProducto(int codigo, String nombre, double precioOferta, LocalDate fechaInicio, LocalDate fechaFin) {
    
	public static OfertaProducto of(Producto producto, double precioOferta, LocalDate fechaInicio, LocalDate fechaFin) {
        return new OfertaProducto(producto.getCodigo(), producto.getNombre(), precioOferta, fechaInicio, fechaFin);
    }

}
