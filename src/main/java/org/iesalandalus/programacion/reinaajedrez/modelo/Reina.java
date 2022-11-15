package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	private Color color;
	private Posicion posicion;
	
	
	public Reina () {
		setColor(Color.BLANCO);	
		setPosicion(new Posicion(1, 'd')); 
	}
	
	public Reina(Color color) {
		setColor(color);
	}
	
	public void colorReina(Color color){
		if(color == Color.BLANCO) {
			setColor(Color.BLANCO);
			setPosicion(new Posicion(1, 'd')); 
		}else if (color == Color.NEGRO) {
			setColor(Color.NEGRO);
			setPosicion(new Posicion(8, 'd')); 
		}
	}


	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
	if (color != Color.BLANCO & color != Color.NEGRO) {
			throw new IllegalArgumentException("ERROR:color no esperado.");
		}
		
		this.color = color;
	}	


	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	
	
	
	
	
	
	
	
	
	
}
