package enums;

public enum EstadoPedido {
	
	PEDIDO("Pedido realizado", 0, 0),
	PREPARADO("Listo para entrega", 0, 2),
	DELIVERED("Entregado", 1, 5);

	private EstadoPedido(String descripcion, int plazoMinimo, int plazoMaximo) {
		this.descripcion = descripcion;
		this.plazoMinimo = plazoMinimo;
		this.plazoMaximo = plazoMaximo;
	}
	
	private final String descripcion;
	private final int plazoMinimo;
	private final int plazoMaximo;
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public int getPlazoMinimo() {
		return plazoMinimo;
	}
	public int getPlazoMaximo() {
		return plazoMaximo;
	}
	
	

}
