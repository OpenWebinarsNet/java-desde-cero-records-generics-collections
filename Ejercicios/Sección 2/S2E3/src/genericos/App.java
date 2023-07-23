package genericos;

public class App {

	public static void main(String[] args) {

		VectorOrdenado<String> vector = new VectorOrdenado<>();
		
		
		System.out.println(vector.size());
		
		vector.add("En");
		vector.add("un");
		vector.add("lugar");
		vector.add("de");
		vector.add("La");
		vector.add("Mancha");
		
		for(int i = 0; i < vector.size(); i++) {
			System.out.println(vector.get(i));
		}
		
	}

}
