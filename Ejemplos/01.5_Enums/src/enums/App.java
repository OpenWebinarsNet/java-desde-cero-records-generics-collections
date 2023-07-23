package enums;

public class App {

	public static void main(String[] args) {

		for(DiaSemana dia : DiaSemana.values()) {
			System.out.println("%d. %s: %s".formatted(dia.ordinal(), dia.name(), saludoDia(dia)));
			
		}
		
		System.out.println("");
		
		EstadoPedido estado = EstadoPedido.PREPARADO;
		
		System.out.println("Descripcion: " + estado.getDescripcion());
		System.out.println("Plazo mínimo: %d días".formatted(estado.getPlazoMinimo()));
		System.out.println("Plazo máximo: %d días".formatted(estado.getPlazoMaximo()));
		
		
		
	}

	public static String saludoDia(DiaSemana dia) {
		String msg = switch (dia) {
			case LUNES -> "Los lunes son duros :(";
			case JUEVES -> "Ya se acerca el finde :O";
			case VIERNES, SABADO -> "Los findes son los mejores días XDDDD";
			case DOMINGO -> "Ufff, que pereza";
			default -> "Ni fu, ni fa";
		};
		
		return msg;

	}

}
