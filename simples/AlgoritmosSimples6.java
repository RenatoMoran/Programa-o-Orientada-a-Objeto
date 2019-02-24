package simples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSimples6 {

	public static void main(String[] args) {
		/*
		6) Um motorista de t�xi deseja calcular o rendimento de seu carro na pra�a. Sabendo-se que o pre�o
		do combust�vel � de R$ 1,90, escreva um programa para ler: a marca��o do od�metro (Km) no in�cio
		do dia, a marca��o (Km) no final do dia, o n�mero de litros de combust�vel gasto e o valor total (R$)
		recebido dos passageiros. Calcular e escrever: a m�dia do consumo em Km/L e o lucro (l�quido) do dia
		 */
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double kmIn, kmFim, litros, valor, media, lucro = 0;
		
		System.out.print("Qual a marca��o do od�metro (Km) no in�cio do dia? ");
		kmIn = teclado.nextDouble();
		
		System.out.print("Qual a marca��o (Km) no final do dia? ");
		kmFim = teclado.nextDouble();
		
		System.out.print("Qual o n�mero de litros de combust�vel gasto? ");
		litros = teclado.nextDouble();
		
		System.out.print("Qual o valor total de (R$) recebido dos passageiros? ");
		valor = teclado.nextDouble();
		
		System.out.println("Qual a m�dia? "+calcularMedia(kmFim,kmIn,litros));
		System.out.println("Qual a lucro? "+calcularLucro(valor,litros));
		
	}
	
	private static double calcularMedia( double kmFim , double kmIn , double litros ) {
		return (kmFim - kmIn) / litros;
	}

	private static double calcularLucro( double valor , double litros ) {
		return valor - (litros * 1.90);
	}
	
}
