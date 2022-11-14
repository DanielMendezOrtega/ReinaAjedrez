package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
	
	 BLANCO("Blanco"),
	 NEGRO("Negro");
	String cadenaMostrar;
	
	

	private Color(String cadenaMostrar) {
		this.cadenaMostrar = cadenaMostrar;
	}
	
	@Override
	public String toString() {
		return String.format("El color es=%s, cadenaMostrar");
	}
	
	
	
}
