package Selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSelecao5 {

	public static void main(String[] args) {
		/*
		5) Escreva um programa para ler um valor e escrever se é positivo ou negativo. Considere o valor
		zero como positivo. 
		*/

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double valor = 0;
		
		System.out.print("Digite um valor: ");
		valor = teclado.nextDouble();
		
		positivoOuNegativo( valor );
		
	}
	
	private static void positivoOuNegativo(double valor) {
		if( valor >= 0 ) {
			System.out.print("Positivo");
		}else {
			System.out.print("Negativo");
		}
	}

}
