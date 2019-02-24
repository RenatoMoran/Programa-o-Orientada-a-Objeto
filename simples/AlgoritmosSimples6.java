package simples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSimples6 {

	public static void main(String[] args) {
		/*
		6) Um motorista de táxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço
		do combustível é de R$ 1,90, escreva um programa para ler: a marcação do odômetro (Km) no início
		do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$)
		recebido dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia
		 */
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double kmIn, kmFim, litros, valor, media, lucro = 0;
		
		System.out.print("Qual a marcação do odômetro (Km) no início do dia? ");
		kmIn = teclado.nextDouble();
		
		System.out.print("Qual a marcação (Km) no final do dia? ");
		kmFim = teclado.nextDouble();
		
		System.out.print("Qual o número de litros de combustível gasto? ");
		litros = teclado.nextDouble();
		
		System.out.print("Qual o valor total de (R$) recebido dos passageiros? ");
		valor = teclado.nextDouble();
		
		System.out.println("Qual a média? "+calcularMedia(kmFim,kmIn,litros));
		System.out.println("Qual a lucro? "+calcularLucro(valor,litros));
		
	}
	
	private static double calcularMedia( double kmFim , double kmIn , double litros ) {
		return (kmFim - kmIn) / litros;
	}

	private static double calcularLucro( double valor , double litros ) {
		return valor - (litros * 1.90);
	}
	
}
