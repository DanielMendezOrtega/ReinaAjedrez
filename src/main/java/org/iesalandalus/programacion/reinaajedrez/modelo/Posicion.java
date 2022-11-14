package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Posicion {
	private int fila;
	private char columna;
	
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	
	public Posicion(Posicion posicion) {
		fila = posicion.getFila();
		columna = posicion.getColumna();
	}
	

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		if (fila < 2) {
			throw new IllegalArgumentException("El numero de la fila no puede ser menor que 1");
		} else if (fila > 8) {
			throw new IllegalArgumentException("El numero de fila no puede ser superior a 8");
		}
		this.fila = fila;
	}

	public char getColumna() {
		return columna;
	}

	public void setColumna(char columna) {
		if (columna > 'h') {
			throw new IllegalArgumentException("Te sales del Tablero; valores de columna -> a,b,c,d,e,f,g,h");
		}
		this.columna = columna;
	}



	
	
}
