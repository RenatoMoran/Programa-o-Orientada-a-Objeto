package repeticaoSelecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosRepeticaoSelecao5 {

	static double Av1 , Av2, media = 0;
	public static Scanner teclado = new Scanner(System.in);
	public static DecimalFormat df = new DecimalFormat("##.##");
	
	public static void main(String[] args) {
		/*
		5) Escreva um programa para ler as notas da 1� e 2� avalia��es de um aluno, calcular e imprimir a
		m�dia semestral. Fa�a com que o algoritmo s� aceite notas v�lidas (uma nota v�lida deve pertencer
		ao intervalo [0,10]). Cada nota deve ser validada separadamente. Deve ser impressa a mensagem
		"Nota inv�lida" caso a nota informada n�o perten�a ao intervalo [0,10].
		*/

		System.out.println("A m�dia �: "+calcularMedia());
		
	}
	
	private static double calcularMedia() {
		
		System.out.print("Digite a nota da Av1: ");
		Av1 = teclado.nextDouble();
		
		do {
			
			if( Av1 < 0 || Av1 > 10 ) {
				System.out.println("Nota inv�lida!");
				System.out.print("Digite a nota da Av1: ");
				Av1 = teclado.nextDouble();
			}
			
		}while( Av1 < 0 || Av1 > 10 );
		
		System.out.print("Digite a nota da Av2: ");
		Av2 = teclado.nextDouble();
		
		do {
			
			if( Av2 < 0 || Av2 > 10 ) {
				System.out.println("Nota inv�lida!");
				System.out.print("Digite a nota da Av2: ");
				Av2 = teclado.nextDouble();
			}
			
		}while( Av2 < 0 || Av2 > 10 );
		
		return ( Av1 + Av2 ) / 2;
	}

}
