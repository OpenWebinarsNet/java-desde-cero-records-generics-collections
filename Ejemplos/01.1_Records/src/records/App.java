package records;

public class App {

	public static void main(String[] args) {

		
		Alumno a = new Alumno("Luis Miguel", "López Magaña", "luismi@email.com", 40);
		
		System.out.println(a);
		
		System.out.println("Nombre: " + a.nombre() + " " + a.apellidos());
		
		
		Alumno b = new Alumno("Luis Miguel", "López Magaña", "luismi@email.com", 40);
		
		Alumno c = new Alumno("Luis", "López Magaña", "luismi@email.com", 40);
		
		System.out.println(a.equals(b));
		
		System.out.println(a.equals(c));
		
	}

}
