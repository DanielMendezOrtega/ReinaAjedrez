package org.iesalandalus.programacion.reinaajedrez.modelo;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	int opcion;
	String colorDeFicha;

	
	private static void consola() {
		
	}
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLUE = "\u001B[34m";
	
	public void mostrarMenu() {
		System.out.println(ANSI_GREEN +"""
		|************||| MENU |||*************|
		|* 1.Crear Reina por defecto.        *|
		|* 2.Crear Reina eligiendo un color. *|
		|* 3.Mover.                          *|
		|* 4.Salir.                          *|
		|*************************************|
		""" +ANSI_RESET);	
	}
	
	public void elegirOpcionMenu() {
		do {
			System.out.println("Elige una opcion del MENU");
			opcion = Entrada.entero();
		}while (opcion < 1 | opcion > 4);
		System.out.println("Ha elegido la opcion " + opcion);

	}
	
	public void elegirOpcion() {
		do {
			System.out.println("Elige un color de ficha");
			colorDeFicha = Entrada.cadena();
		}while (colorDeFicha != "blanco" & colorDeFicha != "negro");
		System.out.println("Ha elegido el color " + colorDeFicha);
	}

	public void mostrarMenuDirecciones() {
		System.out.println(ANSI_CYAN +"""
		|**********|||DIRECCIONES|||*********|
		|*                                  *|
		|*     1.NORTE       5.NORESTE      *|
		|*     2.SUR         6.NOROESTE     *|
		|*     3.ESTE        7.SURESTE      *|
		|*     4.OESTE       8.SUROESTE     *|               
		|*                                  *|
		|************************************|		
				""" +ANSI_RESET);
	}
}
