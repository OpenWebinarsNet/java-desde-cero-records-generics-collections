package liga.model.padel;

import liga.model.base.ParticipanteAbstracto;

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
		return nombreJugador1 + ", " +  nombreJugador2;
	}
	
	
	
	

	
	
	
	
}
