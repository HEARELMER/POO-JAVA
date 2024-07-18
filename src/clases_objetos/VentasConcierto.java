// Escribe un programa que calcule las ventas totales de entradas de un concierto.
// Hay tres tipos de asientos: A, B y C. El programa acepta el número de entradas
// vendidas y el precio de una entrada para cada uno de los tres tipos de asientos.
// Las ventas totales se calculan de la siguiente manera:
// totalVentas = numberDeA_Asientos * pricePerA_Asiento +
// numberDeB_Asientos * pricePerB_Asiento +
// numberDeC_Asientos * pricePerC_Asiento;
// Este programa, se debe escribir utilizando solo una clase, la clase principal del
// programa.

package clases_objetos ;

import java.util.Scanner;

public class VentasConcierto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el número de asientos de tipo A vendidos: ");
		int numberDeA_Asientos = scanner.nextInt();
		System.out.print("Ingrese el precio de cada asiento de tipo A: ");
		double pricePerA_Asiento = scanner.nextDouble();
		
		System.out.print("Ingrese el número de asientos de tipo B vendidos: ");
		int numberDeB_Asientos = scanner.nextInt();
		System.out.print("Ingrese el precio de cada asiento de tipo B: ");
		double pricePerB_Asiento = scanner.nextDouble();
		
		System.out.print("Ingrese el número de asientos de tipo C vendidos: ");
		int numberDeC_Asientos = scanner.nextInt();
		System.out.print("Ingrese el precio de cada asiento de tipo C: ");
		double pricePerC_Asiento = scanner.nextDouble();
		
		double totalVentas = (numberDeA_Asientos * pricePerA_Asiento) +
							  (numberDeB_Asientos * pricePerB_Asiento) +
							  (numberDeC_Asientos * pricePerC_Asiento);
		
		System.out.println("Las ventas totales de entradas del concierto son: $" + totalVentas);
	}
}
