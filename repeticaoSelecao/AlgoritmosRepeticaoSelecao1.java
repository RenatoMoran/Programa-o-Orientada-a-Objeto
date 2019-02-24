package repeticaoSelecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosRepeticaoSelecao1 {
	
	public static double num1, num2 = 0;
	public static Scanner teclado = new Scanner(System.in);
	public static DecimalFormat df = new DecimalFormat("##.##");	

	public static void main(String[] args) {
		/*
		1) Para que a divis�o entre 2 n�meros possa ser realizada, o divisor n�o pode ser nulo (zero). Escreva
		um programa para ler 2 valores e imprimir o resultado da divis�o do primeiro pelo segundo. OBS: O
		programa deve validar a leitura do segundo valor (que n�o deve ser nulo). Enquanto for fornecido
		um valor nulo a leitura deve ser repetida. Utilize a estrutura Repita/At� na constru��o da repeti��o
		de valida��o. 
		*/	
		
		divisaoDoisNum();
		
	}

	private static void divisaoDoisNum() {
		
		System.out.print("Digite o primeiro valor: ");
		num1 = teclado.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		num2 = teclado.nextDouble();
		
		do {
			
			if( num2 <= 0 ) {
				num2 = teclado.nextDouble();
			}
			
		}while ( num2 <= 0 );
		
		System.out.print("Resultado: "+(num1 / num2));
	}
	
}
