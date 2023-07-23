package genericos;

import java.util.List;

public class MathListUtils<T extends Number> {
	
	public double suma(List<T> lista) {
		double acumulador = 0;
		for(T t: lista)
			acumulador = acumulador + t.doubleValue();
		return acumulador;
	}
	

}
