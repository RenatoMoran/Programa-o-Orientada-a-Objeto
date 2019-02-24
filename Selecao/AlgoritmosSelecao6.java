package Selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSelecao6 {

	public static void main(String[] args) {

		/*
		6) Reescreva o programa do exercício anterior considerando o zero como neutro, ou seja, se for
		digitado o valor zero, escrever a palavra zero. 
		*/

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double valor = 0;
		
		System.out.print("Digite um valor: ");
		valor = teclado.nextDouble();
		
		positivoOuNegativo( valor );
		
	}
	
	private static void positivoOuNegativo(double valor) {
		if( valor == 0 ) {
			System.out.print("Zero");
		}else if( valor > 0 ) {
			System.out.print("Positivo");
		}else{
			System.out.print("Negativo");
		}
	}

}
