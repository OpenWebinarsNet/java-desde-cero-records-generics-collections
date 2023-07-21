package records;

public class App {

	public static void main(String[] args) {
		
		Alumno a = new Alumno("A","B","C", 1);
		//Alumno b = new Alumno(null,"B","C", 1);
		
		Alumno c = new Alumno("Miguel", "Machuca", 16);
		System.out.println(c);
		
		Producto p = new Producto(1l, "Nombre del producto", 20.0);
		System.out.println(p);
		
		System.out.println(c.nombreCompleto());

	}

}
