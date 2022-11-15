package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Reina {
	private Color color;
	private Posicion posicion;
	int pasos = 0;
	int auxFila = 0;
	char auxColumna;

	public Reina() {
		setColor(Color.BLANCO);
		setPosicion(new Posicion(1, 'd'));
	}

	public Reina(Color color) {
		setColor(color);
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		
		if (color ==null ){
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		if (color == Color.BLANCO) {
			setPosicion(new Posicion(1, 'd'));
			this.color=color;
		} else if (color == Color.NEGRO) {
			setPosicion(new Posicion(8, 'd'));
			this.color=color;
		}
		
	}

	public Posicion getPosicion() {
		return posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public void mover(Direccion direccion , int pasos) throws OperationNotSupportedException {
		
		if (direccion==null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if(pasos < 1 || pasos > 7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
		try {
			switch (direccion) {
			case NORTE:	
				auxFila = (posicion.getFila() +pasos);
				setPosicion(new Posicion(auxFila, posicion.getColumna()));
				break;
			
			case NORESTE:
				auxFila = (posicion.getFila() +pasos);
				auxColumna = (char)(posicion.getColumna() +pasos);
				setPosicion(new Posicion(auxFila, auxColumna));
				
				break;
			case ESTE:
				auxColumna = (char)(posicion.getColumna() +pasos);
				setPosicion(new Posicion(posicion.getFila() ,auxColumna ));
				break;
			case SUR:
				auxFila = (posicion.getFila() -pasos);
				setPosicion(new Posicion(auxFila, posicion.getColumna()));
				break;
			case SUROESTE:
				auxFila = (posicion.getFila() -pasos);
				auxColumna = (char)(posicion.getColumna() -pasos);
				setPosicion(new Posicion(auxFila, auxColumna));
				break;
			case SURESTE:
				auxFila = (posicion.getFila() -pasos);
				auxColumna = (char)(posicion.getColumna() +pasos);
				setPosicion(new Posicion(auxFila, auxColumna));
				break;
			case OESTE:
				auxColumna = (char)(posicion.getColumna() -pasos);
				setPosicion(new Posicion(posicion.getFila() ,auxColumna ));
				break;
			case NOROESTE:
				auxFila = (posicion.getFila() +pasos);
				auxColumna = (char)(posicion.getColumna() -pasos);
				setPosicion(new Posicion(auxFila, auxColumna));
				break;
			}
			}
			catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
		
		
	}

	@Override
	public String toString() {
		return String.format("color=%s, posicion=(%s)", color, posicion);
	}
	
}


