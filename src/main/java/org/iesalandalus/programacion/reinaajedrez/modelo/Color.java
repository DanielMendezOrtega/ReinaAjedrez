package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {

	BLANCO ("Blanco"),
	NEGRO ("Negro");

	String cadenaAMostrar;

	Color(String colorReina) {
		this.cadenaAMostrar = colorReina;
	
	}
	@Override
	public String toString() {
		return String.format(cadenaAMostrar);
	}

	
	
}
