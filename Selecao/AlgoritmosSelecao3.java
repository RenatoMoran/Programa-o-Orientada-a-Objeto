package Selecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSelecao3 {

	public static void main(String[] args) {
		/*
		3) Escreva um programa para ler as notas das duas avaliações de um aluno no semestre, calcular e
		escrever a média semestral e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se
		o aluno foi aprovado (considere 6.0 a média mínima para aprovação).
		*/

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double Av1, Av2, media = 0;
		
		System.out.print("Digite o valor da Av1: ");
		Av1 = teclado.nextDouble();
		
		System.out.print("Digite o valor da Av2: ");
		Av2 = teclado.nextDouble();
		
		if( calcularMedia( Av1 , Av2 ) >= 6.0 ) {
			
			System.out.print("PARABÉNS! Você foi aprovado!");
			
		}
		
	}
	
	private static double calcularMedia( double Av1 , double Av2 ) {
		return (Av1 + Av2) / 2;
	}

}
