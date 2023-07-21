package liga.model.base;

public class Partido<T extends ParticipanteAbstracto> {
	
	private T participanteUno;
	private T participanteDos;
	private T ganador;
	private T perdedor;
	
	public Partido() {
	}

	
	
	public Partido(T participanteUno, T participanteDos) {
		this.participanteUno = participanteUno;
		this.participanteDos = participanteDos;
	}



	public Partido(T participanteUno, T participanteDos, T ganador, T perdedor) {
		this.participanteUno = participanteUno;
		this.participanteDos = participanteDos;
		this.ganador = ganador;
		this.perdedor = perdedor;
	}

	public T getParticipanteUno() {
		return participanteUno;
	}

	public void setParticipanteUno(T participanteUno) {
		this.participanteUno = participanteUno;
	}

	public T getParticipanteDos() {
		return participanteDos;
	}

	public void setParticipanteDos(T participanteDos) {
		this.participanteDos = participanteDos;
	}

	public T getGanador() {
		return ganador;
	}

	public void setGanador(T ganador) {
		this.ganador = ganador;
	}

	public T getPerdedor() {
		return perdedor;
	}

	public void setPerdedor(T perdedor) {
		this.perdedor = perdedor;
	}
	
	
	


	
	
	
	
	
	
	

}
