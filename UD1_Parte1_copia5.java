package unidad1;

import java.util.Scanner;

public class UD1_Parte1_copia5 {
	public static void main(String[] args) {
		String nombre;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		nombre = entrada.nextLine();
		entrada.close();
		System.out.println("Hola" + nombre);
		
	}
}
