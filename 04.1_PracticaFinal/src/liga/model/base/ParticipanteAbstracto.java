package liga.model.base;

import java.util.Objects;

public abstract class ParticipanteAbstracto {
	
	protected String nombre;
	
	public ParticipanteAbstracto() {}

	public ParticipanteAbstracto(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setName(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParticipanteAbstracto other = (ParticipanteAbstracto) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
}
