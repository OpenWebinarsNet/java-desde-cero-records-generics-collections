package liga;

import liga.dummy.DummyData;
import liga.model.base.Ronda;
import liga.model.base.Torneo;
import liga.model.padel.ParejaPadel;
import liga.model.tenis.JugadorTenis;
import liga.service.ServicioRonda;

public class App {

	public static void main(String[] args) {
			
		jugarTorneoTenis();
		jugarTorneoPadel();	

	}
	
	public static void jugarTorneoTenis() {
		Torneo<JugadorTenis> torneoLocalTenis = new Torneo<>();
		torneoLocalTenis.setParticipantes(DummyData.generarJugadoresTenis());
		
		
		ServicioRonda<JugadorTenis> servicioRonda = new ServicioRonda<>(torneoLocalTenis);
		
		Ronda<JugadorTenis> ronda = servicioRonda.primeraRonda();
		DummyData.establecerDatosRonda(ronda);
		ronda.terminarRonda();
		
		System.out.println("TORNEO DE TENIS");
		System.out.println("================");
		torneoLocalTenis.mostrarDatosUltimaRonda();
		
		while (ronda.isEsFinal() != true) {
			ronda = servicioRonda.siguienteRonda();
			// Aquí simulamos establecer todos los datos de los partidos de esta ronda
			DummyData.establecerDatosRonda(ronda);
			ronda.terminarRonda();
			torneoLocalTenis.mostrarDatosUltimaRonda();
		}
		
	}
	
	
	public static void jugarTorneoPadel() {
		
		Torneo<ParejaPadel> torneoVirtualPadel = new Torneo<>();
		torneoVirtualPadel.setParticipantes(DummyData.generarParejaPadel());
		
		ServicioRonda<ParejaPadel> servicioRonda = new ServicioRonda<>(torneoVirtualPadel);
		
		Ronda<ParejaPadel> ronda = servicioRonda.primeraRonda();
		DummyData.establecerDatosRonda(ronda);
		ronda.terminarRonda();

		System.out.println("TORNEO DE PÁDEL");
		System.out.println("================");
		torneoVirtualPadel.mostrarDatosUltimaRonda();
		
		while (ronda.isEsFinal() != true) {
			ronda = servicioRonda.siguienteRonda();
			// Aquí simulamos establecer todos los datos de los partidos de esta ronda
			DummyData.establecerDatosRonda(ronda);
			ronda.terminarRonda();
			torneoVirtualPadel.mostrarDatosUltimaRonda();
		}
		
		
	}

}
