package campeonato.model.padel;

import java.util.Objects;

import campeonato.model.base.ParticipanteAbstracto;

public class ParejaPadel extends ParticipanteAbstracto {
	
	private String nombreJugador1, nombreJugador2;

	public ParejaPadel() {
		super();
	}

	public ParejaPadel(String nombre) {
		super(nombre);
	}

	public ParejaPadel(String nombre, String nombreJugador1, String nombreJugador2) {
		super(nombre);
		this.nombreJugador1 = nombreJugador1;
		this.nombreJugador2 = nombreJugador2;
	}

	@Override
	public String getNombre() {
		return "%s (%s, %s)".formatted(nombre, nombreJugador1, nombreJugador2);
	}

	public String getNombreJugador1() {
		return nombreJugador1;
	}

	public void setNombreJugador1(String nombreJugador1) {
		this.nombreJugador1 = nombreJugador1;
	}

	public String getNombreJugador2() {
		return nombreJugador2;
	}

	public void setNombreJugador2(String nombreJugador2) {
		this.nombreJugador2 = nombreJugador2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nombreJugador1, nombreJugador2);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParejaPadel other = (ParejaPadel) obj;
		return Objects.equals(nombreJugador1, other.nombreJugador1)
				&& Objects.equals(nombreJugador2, other.nombreJugador2);
	}

	@Override
	public String toString() {
		return "ParejaPadel [nombreJugador1=" + nombreJugador1 + ", nombreJugador2=" + nombreJugador2 + "]";
	}
	
	
	
	
	
	
	
	

}
