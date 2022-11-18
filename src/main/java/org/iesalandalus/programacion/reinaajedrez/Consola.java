package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {

	
	

	private static void consola() {

	}

	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLUE = "\u001B[34m";

	public static void mostrarMenu() {
		System.out.println(ANSI_GREEN + """
				
				|************||| MENU |||*************|
				|* 1.Crear Reina por defecto.        *|
				|* 2.Crear Reina eligiendo un color. *|
				|* 3.Mover.                          *|
				|* 4.Salir.                          *|
				|*************************************|
				""" + ANSI_RESET);
	}

	public static int elegirOpcionMenu() {
		int opcion = 0;
		
		
		do {
			System.out.print("Elige una opcion del MENU ==> ");
			opcion = Entrada.entero();
		} while (opcion != 1 && opcion != 2 && opcion!=3 && opcion!=4);
		return opcion;
			
		}


	public static Color elegirColor() {
		
		int colorDeFicha;
		
		do {
			
			System.out.print("""
					Elige un color de ficha:
					1-Para Color BLANCO
					2-Para Color NEGRO
					""");
			colorDeFicha = Entrada.entero();
		} while (colorDeFicha != 1 && colorDeFicha != 2);
		if (colorDeFicha == 1) {
			return Color.BLANCO;
			
		} else if (colorDeFicha == 2) {
			return Color.NEGRO;
		}
		return null;
		
	}

	public static void mostrarMenuDirecciones() {
		System.out.println(ANSI_CYAN + """
				|**********|||DIRECCIONES|||*********|
				|*                                  *|
				|*     1.NORTE       5.NORESTE      *|
				|*     2.SUR         6.NOROESTE     *|
				|*     3.ESTE        7.SURESTE      *|
				|*     4.OESTE       8.SUROESTE     *|
				|*                                  *|
				|************************************|
						""" + ANSI_RESET);
	}

	public static Direccion elegirDireccion() {
		int direccion;
		Consola.mostrarMenuDirecciones();
		do {
			System.out.print("Elige una direccion ==> ");
			direccion = Entrada.entero();
		} while (direccion < 1 | direccion > 8);
		switch (direccion) {
		case 1:
			return Direccion.NORTE;
		case 2:
			return Direccion.SUR;
		case 3:
			return Direccion.ESTE;
		case 4:
			return Direccion.OESTE;
		case 5:
			return Direccion.NORESTE;
		case 6:
			return Direccion.NOROESTE;
		case 7:
			return Direccion.SURESTE;
		case 8:
			return Direccion.SUROESTE;
		}
		return null;
	}

	public static int elegirPasos() {
		int numPasos;
		System.out.print("Elige el numero de pasos a mover ==> ");
		numPasos = Entrada.entero();
		return numPasos;
	}

	public static void despedirse() {
		System.out.println(ANSI_YELLOW + """
				           (0 0)
				------oOO---(_)---oOO------
				|||||||||||||||||||||||||||
				|    Hasta luego LUCAS... |
				|||||||||||||||||||||||||||
				---------------------------
				          |__|__|
				           || ||
				          ooO Ooo
								""" + ANSI_RESET);
	}
}
