package unidad1;

//@auothor Erikaatm

import java.util.Scanner;

public class UD1_Parte1_ejercicio6 {
	public static void main(String[] args) {
		
		/*Pseudocódigo;
		 * Inicio
		 * 	Imprimir por pantalla: "Inserte lado del cuadrado para darte el área:"
		 * 	Leer: num
		 * 	Int num
		 * 	Int resul
		 * 	Resul = num * num
		 * 	Imprimir por pantalla: "El área del cuadrado es: " resul  
		 * Fin
		 */
		
		//Imprimir por pantalla: "Inserte lado del cuadrado para darte el área:"
		System.out.println("Inserte lado del cuadrado para darte el área: ");
		
		/*Leer: num
		 * Se necesita Scanner entrada = new Scanner(System.in); para poder leer el número.
		 */
		Scanner entrada = new Scanner(System.in);
		
		//Int num; convertir num en número entero.
		int num = entrada.nextInt();
		
		//Int resul		Resul = num * num
		int resul = num*num;
		
		//Esto se necesita para cerrar la entrada.
		entrada.close();
		
		//Imprimir por pantalla: "El área del cuadrado es: " resul. 
		System.out.println(" El área del cuadrado es: " + resul);
		
		
	}
}
