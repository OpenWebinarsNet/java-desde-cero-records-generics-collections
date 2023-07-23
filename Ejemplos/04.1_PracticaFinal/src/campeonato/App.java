package campeonato;

import campeonato.dummy.DummyData;
import campeonato.model.base.Ronda;
import campeonato.model.base.Torneo;
import campeonato.model.padel.ParejaPadel;
import campeonato.model.tenis.JugadorTenis;
import campeonato.service.ServicioRonda;

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
		System.out.println("===============");
		torneoLocalTenis.mostrarDatosUltimaRonda();
		
		while(ronda.isEsFinal() != true) {
			ronda = servicioRonda.siguienteRonda();
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
		System.out.println("===============");
		torneoVirtualPadel.mostrarDatosUltimaRonda();
		
		while(ronda.isEsFinal() != true) {
			ronda = servicioRonda.siguienteRonda();
			DummyData.establecerDatosRonda(ronda);
			ronda.terminarRonda();
			torneoVirtualPadel.mostrarDatosUltimaRonda();
		}

	}

}
