package simples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSimples3 {

	private static Scanner teclado;

	public static void main(String[] args) {
		/*
		 3) Escreva um programa para ler uma temperatura em graus Celsius, 
		 calcular e escrever o valor correspondente em graus Fahrenheit.
		 */

		teclado = new Scanner(System.in); 
		
		double cel = 0;
		
		System.out.print("Digite uma temperatura em Celsius: ");
		cel = teclado.nextDouble();
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		System.out.println("A temperatura em Fahrenheit é: "+df.format(transformarCelParaFar(cel)));
		
	}

	private static double transformarCelParaFar( double cel ) {
		return (cel * (5/9)) + 32;
	}
	
}
