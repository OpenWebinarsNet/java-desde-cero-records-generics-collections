package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		List<Producto> listaProductos = new ArrayList<>();
		CarritoCompra carrito = new CarritoCompra();

		Producto p1 = new Producto("Camiseta", 15.99);
        Producto p2 = new Producto("Pantalón", 29.99);
        Producto p3 = new Producto("Zapatos", 49.99);
        Producto p4 = new Producto("Gorra", 9.99);
        Producto p5 = new Producto("Bufanda", 12.99);
        Producto p6 = new Producto("Chaqueta", 39.99);
        Producto p7 = new Producto("Vestido", 34.99);
        Producto p8 = new Producto("Calcetines", 4.99);
        Producto p9 = new Producto("Bolso", 24.99);
        Producto p10 = new Producto("Reloj", 79.99);
        
        Collections.addAll(listaProductos, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        
        
        carrito.add(p1);
        carrito.add(p2);
        carrito.add(p2);
        
        Map<Producto, Integer> productosEnCarrito = carrito.get();
        
        for(Producto p : productosEnCarrito.keySet()) {
        	System.out.println("Producto: %s, precio unitario: %.2f, unidades: %d".formatted(p.getNombre(), p.getPvp(), productosEnCarrito.get(p)));
        }
        System.out.println("Total %.2f€".formatted(carrito.total()));
        
        
        

		
		
	}

}
