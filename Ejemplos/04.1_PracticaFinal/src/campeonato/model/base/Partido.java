package campeonato.model.base;

import java.util.Objects;

public class Partido<T extends ParticipanteAbstracto>{
	
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

	@Override
	public int hashCode() {
		return Objects.hash(ganador, participanteDos, participanteUno, perdedor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return Objects.equals(ganador, other.ganador) && Objects.equals(participanteDos, other.participanteDos)
				&& Objects.equals(participanteUno, other.participanteUno) && Objects.equals(perdedor, other.perdedor);
	}

	@Override
	public String toString() {
		return "Partido [participanteUno=" + participanteUno + ", participanteDos=" + participanteDos + ", ganador="
				+ ganador + ", perdedor=" + perdedor + "]";
	}
	
	
	

}
