package simples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSimples2 {

	private static Scanner teclado;

	public static void main(String[] args) {
		/*
		2) Escreva um programa para ler uma temperatura em graus Fahrenheit, 
		calcular e escrever o valor correspondente em graus Celsius.
		*/
		
		teclado = new Scanner(System.in); 
		
		double far = 0;
		
		System.out.print("Digite uma temperatura em Fahrenheit: ");
		far = teclado.nextDouble();
		
		DecimalFormat df = new DecimalFormat("##.##");
		
		System.out.println("A temperatura em Celsius é: "+df.format(transformarFarParaCel(far)));
		
	}

	private static double transformarFarParaCel( double far ) {
		return (far - 32) * (5/9);
	}
	
}
