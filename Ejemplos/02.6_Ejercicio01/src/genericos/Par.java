package genericos;

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
	public String toString() {
		return "Par [primerObjeto=" + primerObjeto + ", segundoObjeto=" + segundoObjeto + "]";
	}

    
    
    
}

