package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.nio.charset.CoderMalfunctionError;

import javax.naming.OperationNotSupportedException;

public class Main {

	public static void main(String[] args) {
		
		Consola Co = new Consola();
		Co.mostrarMenu();
		Co.mostrarMenuDirecciones();
		Co.elegirDireccion();
		Co.despedirse();
		
		
		
	/*try {
	
	
		Reina reinaBlanca1 = new Reina();
		reinaBlanca1.setColor(Color.BLANCO);
		System.out.println(reinaBlanca1.getPosicion());
		reinaBlanca1.mover(Direccion.SUR ,1);
		System.out.println(reinaBlanca1.getPosicion());
		reinaBlanca1.mover(Direccion.NORTE, 2);
		System.out.println(reinaBlanca1.getPosicion());
		reinaBlanca1.mover(Direccion.SUR, 2);
		System.out.println(reinaBlanca1.getPosicion());
		reinaBlanca1.mover(Direccion.ESTE, 1);
		System.out.println(reinaBlanca1.getPosicion());
	}
	catch(OperationNotSupportedException e) {
		System.out.println(e.getMessage());
	}  */
		
		
	}

}
