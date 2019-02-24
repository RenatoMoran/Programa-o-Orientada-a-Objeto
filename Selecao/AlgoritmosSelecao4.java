package Selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSelecao4 {

	public static void main(String[] args) {
		/*
		4) Acrescente ao exerc�cio anterior a mensagem Voc� foi REPROVADO! Estude mais... caso a
		m�dia calculada seja menor que 6.0.  
		*/

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double Av1, Av2, media = 0;
		
		System.out.print("Digite o valor da Av1: ");
		Av1 = teclado.nextDouble();
		
		System.out.print("Digite o valor da Av2: ");
		Av2 = teclado.nextDouble();
		
		if( calcularMedia( Av1 , Av2 ) >= 6.0 ) {
			
			System.out.print("PARAB�NS! Voc� foi aprovado!");
			
		}else {
			
			System.out.print("Voc� foi REPROVADO! Estude mais...");
			
		}
		
	}

	private static double calcularMedia( double Av1 , double Av2 ) {
		return (Av1 + Av2) / 2;
	}

	
}
