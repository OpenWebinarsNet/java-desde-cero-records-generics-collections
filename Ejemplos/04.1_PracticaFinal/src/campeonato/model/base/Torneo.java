package campeonato.model.base;

import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Torneo<T extends ParticipanteAbstracto> {
	
	private List<T> participantes;
	private SortedSet<Ronda<T>> rondas;
	
	public Torneo() {
		rondas = new TreeSet<>();
	}
	
	public Torneo(List<T> participantes) {
		this();
		this.participantes = participantes;
	}

	public List<T> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(List<T> participantes) {
		this.participantes = participantes;
	}

	public SortedSet<Ronda<T>> getRondas() {
		return rondas;
	}

	public void setRondas(SortedSet<Ronda<T>> rondas) {
		this.rondas = rondas;
	}
	
	private void mostrarDatosRonda(Ronda<T> ronda) {
		System.out.println("RONDA Nº %d - %s".formatted(ronda.getNumero(), ronda.getTitulo().toUpperCase()));
		System.out.println("=========================================");
		System.out.println();
		System.out.println("---- PARTIDOS ----");
		System.out.println();
		for(Partido<T> p : ronda.getPartidos()) {
			String msg = "J1: %s - J2: %s".formatted(p.getParticipanteUno().getNombre(), p.getParticipanteDos().getNombre());
			if (p.getGanador() != null)
				msg += " - Ganador: %s".formatted(p.getGanador().getNombre());
			System.out.println(msg);
		}
		System.out.println();
	}
	
	public void mostrarDatosUltimaRonda() {
		if (rondas.size() > 0) {
			mostrarDatosRonda(rondas.last());
		} else
			System.out.println("Todavía no se ha iniciado la primera ronda");
	}
	
	public void mostrarDatosTodasLasRondas() {
		if (rondas.size() > 0) {
			for(Ronda<T> r : rondas) {
				mostrarDatosRonda(r);
			}
		} else
			System.out.println("Todavía no se ha iniciado la primera ronda");
	}

	@Override
	public String toString() {
		return "Torneo [participantes=" + participantes + ", rondas=" + rondas + "]";
	}
	
	
	
	

}
