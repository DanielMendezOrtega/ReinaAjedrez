package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {

	BLANCO("Blanco"), NEGRO("Negro");

	String cadenaMostrar;

	private Color(String colorReina) {
		this.cadenaMostrar = colorReina;

	}

	@Override
	public String toString() {
		return String.format(cadenaMostrar);
	}

}
