package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Main {

	public static void main(String[] args) {
		Posicion posicion1 = new Posicion(0, 0);
		Posicion posicion2 = new Posicion(posicion1);
		
		System.out.println(posicion2.getFila());
		System.out.println(posicion2.getColumna());

	}

}
