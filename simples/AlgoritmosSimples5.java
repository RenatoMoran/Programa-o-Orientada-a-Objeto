package simples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSimples5 {

	public static void main(String[] args) {
		/*
		5) Escreva um programa para ler as dimensões de uma cozinha retangular (comprimento, largura e
		altura), calcular e escrever a quantidade de caixas de azulejos para se colocar em todas as suas
		paredes (considere que não será descontada a área ocupada por portas e janelas). Cada caixa de
		azulejos possui 1,5 m.
		 */

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double comp, larg, alt, area = 0;
		int caixas = 0;
		
		System.out.print("Qual o comprimento da cozinha? ");
		comp = teclado.nextDouble();
		
		System.out.print("Qual a largura da cozinha? ");
		larg = teclado.nextDouble();
		
		System.out.print("Qual a altura da cozinha? ");
		alt = teclado.nextDouble();
		
		System.out.print("A Quantidade de caixas de azulejos é: "+ calcularCaixas(calcularArea(comp, larg, alt)));
	}
	
	private static double calcularArea( double comp , double larg , double alt ) {
		return (comp * alt * 2) + (larg * alt * 2);
	}


	private static int calcularCaixas( double area ) {
		return ( int ) ( area / 1.5 );
	}
	
}
