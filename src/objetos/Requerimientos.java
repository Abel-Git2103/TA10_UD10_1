/*
 * @autor: Abel Jornet
 * Fecha modificación: 07/02/2021
 */
package objetos;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Requerimientos {

	Scanner consola = new Scanner(System.in);
	static int numAleatorio = (int) Math.round(Math.random() * (500 - 1)) + 1;

	public void aciertaNumero() {

		int numSeleccionado = 0;
		int numIntentos = 0;

		do {
			try {
				System.out.println("Introduce un valor entre 1 y 500:");
				numSeleccionado = consola.nextInt();
				numIntentos++;
				
				esCorrecto(numSeleccionado, numIntentos);

			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es correcto");
				consola.nextLine();
				numIntentos++;
				
			}			

		} while (numSeleccionado != numAleatorio);

	}

	public static void esCorrecto(int numSeleccionado, int numIntentos) {

		if (numSeleccionado < numAleatorio) {
			System.out.println("Debes introducir un valor mas grande");
		} else if (numSeleccionado > numAleatorio) {
			System.out.println("Debes introducir un valor mas pequeño");
		} else if (numSeleccionado == numAleatorio) {
			System.out.println("Has acertado tras realizar " + numIntentos + " intentos");
		}

	}
}
