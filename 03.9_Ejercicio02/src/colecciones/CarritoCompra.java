package colecciones;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarritoCompra {

	private Map<Producto, Integer> carrito;

	public CarritoCompra() {
		carrito = new LinkedHashMap<>(); // Mantenemos orden de inserción
	}

	public int add(Producto p) {
		int unidades = 1;
		if (carrito.containsKey(p)) {
			unidades = carrito.get(p) + 1;
		}
		carrito.put(p, unidades);
		return unidades;
	}
	
	public void remove(Producto p) {
		carrito.remove(p);
	}
	
	public void clear() {
		carrito.clear();
	}
	
	public double total() {
		double result = 0.0;
		
		for(Producto p : carrito.keySet()) {
			result += p.getPvp() * carrito.get(p);
		}
		
		return result;
		
	}
	
	public Map<Producto, Integer> get() {
		return Collections.unmodifiableMap(carrito);
	}

}
