package colecciones;

import java.util.Objects;

public class Par<T, U> {
    private T primerObjeto;
    private U segundoObjeto;

    public Par(T primerObjeto, U segundoObjeto) {
        this.primerObjeto = primerObjeto;
        this.segundoObjeto = segundoObjeto;
    }

    public T getPrimerObjeto() {
        return primerObjeto;
    }

    public void setPrimerObjeto(T primerObjeto) {
        this.primerObjeto = primerObjeto;
    }

    public U getSegundoObjeto() {
        return segundoObjeto;
    }

    public void setSegundoObjeto(U segundoObjeto) {
        this.segundoObjeto = segundoObjeto;
    }
    
    public static <T,U> Par<T,U> of(T primerObjeto, U segundoObjeto) {
    	return new Par<>(primerObjeto, segundoObjeto);
    }
    

	@Override
	public int hashCode() {
		return Objects.hash(primerObjeto, segundoObjeto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par other = (Par) obj;
		return Objects.equals(primerObjeto, other.primerObjeto) && Objects.equals(segundoObjeto, other.segundoObjeto);
	}

	@Override
	public String toString() {
		return "Par [primerObjeto=" + primerObjeto + ", segundoObjeto=" + segundoObjeto + "]";
	}
    
}

