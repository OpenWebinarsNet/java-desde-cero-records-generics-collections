package campeonato.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import campeonato.model.base.ParticipanteAbstracto;
import campeonato.model.base.Partido;
import campeonato.model.base.Ronda;
import campeonato.model.base.Torneo;

public class ServicioRonda<T extends ParticipanteAbstracto> {
	
	private int rondasJugadas;
	private Torneo<T> torneo;
	private List<T> participantes;
	private List<T> participantesDirectosSiguienteRonda;
	
	public ServicioRonda() {
		rondasJugadas = 0;
	}
	
	public ServicioRonda(Torneo<T> torneo) {
		this();
		this.torneo = torneo;
		this.participantes = torneo.getParticipantes();
		this.participantesDirectosSiguienteRonda = new ArrayList<>();
	}

	
	private List<Partido<T>> sorteo(List<T> participantes) {
		
		List<T> copia = new ArrayList<>(participantes);
		Collections.shuffle(copia);
		
		List<Partido<T>> result = new ArrayList<>();
		
		for(int i = 0; i< copia.size(); i+=2) {
			result.add(new Partido<T>(copia.get(i), copia.get(i+1)));
		}
		
		return result;
		
	}
	
	private String getNombreRonda(int numRonda, int numParticipantes) {
		return switch(numParticipantes) {
		case 16 -> "Octavos de final";
		case 8 -> "Cuartos de final";
		case 4 -> "Semifinales";
		case 2 -> "Final";
		default -> "%dª Ronda".formatted(numRonda);
		};
	}
	
	
	public Ronda<T> primeraRonda() {
		
		participantesDirectosSiguienteRonda.clear();
		List<T> copia = new ArrayList<>(participantes);
		Random r = new Random();
		if (copia.size() % 2 != 0) {
			int pos = r.nextInt(copia.size());
			T elegido = copia.remove(pos);
			participantesDirectosSiguienteRonda.add(elegido);
		}
		
		List<Partido<T>> partidos = sorteo(copia);
		rondasJugadas++;
		Ronda<T> ronda = new Ronda<>(rondasJugadas, getNombreRonda(rondasJugadas, copia.size()), partidos, false);
		torneo.getRondas().add(ronda);
		return ronda;
		
	}
	
	public Ronda<T> siguienteRonda() {
		
		Ronda<T> rondaAnterior = torneo.getRondas().last();
		if (rondaAnterior.isEsFinal() || !rondaAnterior.isTerminada())
			return null;
		
		List<T> participantes = rondaAnterior.getGanadores();
		participantes.addAll(participantesDirectosSiguienteRonda);
		participantesDirectosSiguienteRonda.clear();
		
		Random r = new Random();
		if (participantes.size() % 2 != 0) {
			int pos = r.nextInt(participantes.size());
			T elegido = participantes.remove(pos);
			participantesDirectosSiguienteRonda.add(elegido);
		}
		
		List<Partido<T>> partidos = sorteo(participantes);
		rondasJugadas++;
		boolean esFinal = participantes.size() == 2 && participantesDirectosSiguienteRonda.size() == 0;
		Ronda<T> ronda = new Ronda<>(rondasJugadas, getNombreRonda(rondasJugadas, participantes.size()), partidos, esFinal);
		torneo.getRondas().add(ronda);
		return ronda;

		
	}
}
