package campeonato.dummy;

import java.util.ArrayList;
import java.util.List;

import campeonato.model.base.ParticipanteAbstracto;
import campeonato.model.base.Ronda;
import campeonato.model.padel.ParejaPadel;
import campeonato.model.tenis.JugadorTenis;

public interface DummyData {
	
	static List<JugadorTenis> generarJugadoresTenis() {
		
		List<JugadorTenis> jugadores = new ArrayList<>();
		
	    jugadores.add(new JugadorTenis("Carlos Alcaraz"));
		jugadores.add(new JugadorTenis("Roger Federer"));
	    jugadores.add(new JugadorTenis("Rafael Nadal"));
	    jugadores.add(new JugadorTenis("Novak Djokovic"));
	    jugadores.add(new JugadorTenis("Serena Williams"));
	    jugadores.add(new JugadorTenis("Ashleigh Barty"));
	    jugadores.add(new JugadorTenis("Naomi Osaka"));
	    jugadores.add(new JugadorTenis("Stefanos Tsitsipas"));
	    jugadores.add(new JugadorTenis("Alexander Zverev"));
	    jugadores.add(new JugadorTenis("Bianca Andreescu"));
	    jugadores.add(new JugadorTenis("Sofia Kenin"));
	    jugadores.add(new JugadorTenis("Dominic Thiem"));
	    jugadores.add(new JugadorTenis("Simona Halep"));
	    jugadores.add(new JugadorTenis("Daniil Medvedev"));
	    jugadores.add(new JugadorTenis("Karolina Pliskova"));
	    jugadores.add(new JugadorTenis("Andrey Rublev"));
	    jugadores.add(new JugadorTenis("Elina Svitolina"));
	    jugadores.add(new JugadorTenis("Diego Schwartzman"));
	    jugadores.add(new JugadorTenis("Aryna Sabalenka"));
	    jugadores.add(new JugadorTenis("Matteo Berrettini"));
	    jugadores.add(new JugadorTenis("Garbiñe Muguruza"));
	    jugadores.add(new JugadorTenis("Pablo Carreño Busta"));
	    jugadores.add(new JugadorTenis("Petra Kvitova"));
	    jugadores.add(new JugadorTenis("Jannik Sinner"));
	    jugadores.add(new JugadorTenis("Belinda Bencic"));
	    jugadores.add(new JugadorTenis("Casper Ruud"));
	    jugadores.add(new JugadorTenis("Kiki Bertens"));
	    jugadores.add(new JugadorTenis("Cristian Garin"));
	    jugadores.add(new JugadorTenis("Marketa Vondrousova"));
	    jugadores.add(new JugadorTenis("Aslan Karatsev"));

		return jugadores;
		
	}
	
	static List<ParejaPadel> generarParejaPadel() {
		
		List<ParejaPadel> participantes = new ArrayList<>();
		
		// Crear algunas instancias de ParejaPadel con nombres reales de jugadores famosos
        ParejaPadel pareja1 = new ParejaPadel("Pareja 1", "Fernando Belasteguín", "Pablo Lima");
        ParejaPadel pareja2 = new ParejaPadel("Pareja 2", "Alejandro Galán", "Juan Lebrón");
        ParejaPadel pareja3 = new ParejaPadel("Pareja 3", "Paquito Navarro", "Sanyo Gutiérrez");
        ParejaPadel pareja4 = new ParejaPadel("Pareja 4", "Marta Marrero", "Alejandra Salazar");
        ParejaPadel pareja5 = new ParejaPadel("Pareja 5", "Ariana Sánchez", "Paula Josemaría");
        ParejaPadel pareja6 = new ParejaPadel("Pareja 6", "Miguel Lamperti", "Lucas Campagnolo");
        ParejaPadel pareja7 = new ParejaPadel("Pareja 7", "Juani Mieres", "Alejandro Ruiz");
        ParejaPadel pareja8 = new ParejaPadel("Pareja 8", "Bea González", "Delfi Brea");

        participantes.addAll(List.of(pareja1, pareja2, pareja3, pareja4, pareja5, pareja6, pareja7, pareja8));

		
		return participantes;
		
	}
	
	static <T extends ParticipanteAbstracto> void establecerDatosRonda(Ronda<T> ronda) {
		UtilsPartidos.simularPartidos(ronda.getPartidos());
	}

}
