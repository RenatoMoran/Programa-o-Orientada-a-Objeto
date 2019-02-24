package Selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSelecao2 {

	public static void main(String[] args) {
		/*
		2) Escreva um programa que leia as notas das duas avaliações normais e a nota da avaliação optativa.
		Caso o aluno não tenha feito a optativa deve ser fornecido o valor –1. Calcular a média do semestre
		considerando que a prova optativa substitui a nota mais baixa entre as duas primeiras avaliações.
		Escrever a média e mensagens que indiquem se o aluno foi aprovado, reprovado ou está em exame,
		de acordo com as informações abaixo:
		Aprovado : media >= 6.0
		Reprovado: media < 3.0
		Exame : media >= 3.0 e < 6.0
		*/

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double Av1, Av2, Av3, media = 0;
		
		System.out.print("Digite o valor da Av1: ");
		Av1 = teclado.nextDouble();
		
		System.out.print("Digite o valor da Av2: ");
		Av2 = teclado.nextDouble();
		
		System.out.print("Digite o valor da Av3: ");
		Av3 = teclado.nextDouble();
		
		if( Av3 == -1 ) {

			calcularAprovacao( Av1, Av2 );
			
		}else {
			
			CalcularAprovacao2( Av1, Av2 , Av3);
			
		}
		
		
	}
	
	private static void calcularAprovacao( double Av1, double Av2 ) {
		double media = (Av1 + Av2) / 2;
		
		if( media >= 6.0 ) {
			
			System.out.print("Aprovado.");
			
		}else if( media >= 3.0 && media < 6.0 ){
			
			System.out.print("Exame.");
			
		}else {
			
			System.out.print("Reprovado.");
			
		}
	}
	
	private static void CalcularAprovacao2( double Av1, double Av2 , double Av3) {
		
		double media = 0;
		
		if( Av1 >= Av3 && Av2 >= Av3 ) {
			
			media = (Av1 + Av2) / 2;
			
			if( media >= 6.0 ) {
				
				System.out.print("Aprovado.");
				
			}else if( media >= 3.0 && media < 6.0 ){
				
				System.out.print("Exame.");
				
			}else {
				
				System.out.print("Reprovado.");
				
			}
			
		}else if( Av2 >= Av1 && Av3 >= Av1 ) {
			
			media = (Av2 + Av3) / 2;
			
			if( media >= 6.0 ) {
				
				System.out.print("Aprovado.");
				
			}else if( media >= 3.0 && media < 6.0 ){
				
				System.out.print("Exame.");
				
			}else {
				
				System.out.print("Reprovado.");
				
			}
			
		}else if( Av3 >= Av2 && Av1 >= Av2 ) {
			
			media = (Av1 + Av3) / 2;
			
			if( media >= 6.0 ) {
				
				System.out.print("Aprovado.");
				
			}else if( media >= 3.0 && media < 6.0 ){
				
				System.out.print("Exame.");
				
			}else {
				
				System.out.print("Reprovado.");
				
			}
			
		}
	}

}
