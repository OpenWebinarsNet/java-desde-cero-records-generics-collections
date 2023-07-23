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
	
	public int set(Producto p, int unidades) {
		if (unidades > 0)
			carrito.put(p, unidades);
		else
			carrito.remove(p);
		return unidades;
	}
	
	public int decrement(Producto p) {
		int unidades = 0;
		if (carrito.containsKey(p)) {
			unidades = carrito.get(p);
			unidades--;
			if (unidades > 0) {
				carrito.put(p, unidades);
			} else
				remove(p);
		}
		return unidades;
	}
	
	public void remove(Producto p) {
		carrito.remove(p);
	}
	
	public void clear() {
		carrito.clear();
	}
	
	public double subtotal(Producto p) {
		return carrito.containsKey(p) ? (p.getPvp() * carrito.get(p)) : 0.0; 
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
