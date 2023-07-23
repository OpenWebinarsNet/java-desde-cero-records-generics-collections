package campeonato.model.base;

import java.util.ArrayList;
import java.util.List;

public class Ronda<T extends ParticipanteAbstracto> implements Comparable<Ronda<T>> {

	private int numero;
	private String titulo;
	private List<Partido<T>> partidos;
	private boolean esFinal;
	private boolean terminada;
	private List<T> ganadores;
	
	
	public Ronda(int numero, String titulo, List<Partido<T>> partidos, boolean esFinal) {
		this.numero = numero;
		this.titulo = titulo;
		this.partidos = partidos;
		this.esFinal = esFinal;
		this.ganadores = new ArrayList<>();
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public List<Partido<T>> getPartidos() {
		return partidos;
	}


	public void setPartidos(List<Partido<T>> partidos) {
		this.partidos = partidos;
	}


	public boolean isEsFinal() {
		return esFinal;
	}


	public void setEsFinal(boolean esFinal) {
		this.esFinal = esFinal;
	}


	public boolean terminarRonda() {
		this.terminada = true;
		
		for(Partido<T> p : partidos) {
			this.terminada &= (p.getGanador() != null); 
		}
		
		if (this.terminada) {
			extraerGanadores();
		}
		
		return this.terminada;
	}

	
	public boolean isTerminada() {
		return this.terminada;
	}
	
	

	private void extraerGanadores() {
		for(Partido<T> p : partidos) {
			ganadores.add(p.getGanador());
		}
		
	}
	

	public List<T> getGanadores() {
		if (this.terminada)
			return ganadores;
		else
			return null;
	}


	@Override
	public int compareTo(Ronda<T> o) {
		return Integer.compare(numero, o.numero);
	}

}
