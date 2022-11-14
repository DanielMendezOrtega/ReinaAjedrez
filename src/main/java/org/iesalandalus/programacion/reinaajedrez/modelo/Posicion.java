package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	private int fila;
	private char columna;
	
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("No puedo copiar una posición nula.");
		}
		fila = posicion.getFila();
		columna = posicion.getColumna();
	}
	

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		if (fila < 2 | fila >8) {			
			throw new IllegalArgumentException("ERROR: Fila no valida.");
		}
		
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		if (columna > 'h') {
			throw new IllegalArgumentException("ERROR: Columna no valida.");
		}
		
		this.columna = columna;
	}

	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return String.format("fila=%s, columna=%s", fila, columna);
	}

	

	
	
}
