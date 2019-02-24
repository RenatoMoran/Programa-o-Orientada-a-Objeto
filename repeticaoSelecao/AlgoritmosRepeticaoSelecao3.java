package repeticaoSelecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosRepeticaoSelecao3 {

	public static void main(String[] args) {
		/*
		1) Para que a divisão entre 2 números possa ser realizada, o divisor não pode ser nulo (zero). Escreva
		um programa para ler 2 valores e imprimir o resultado da divisão do primeiro pelo segundo. OBS: O
		programa deve validar a leitura do segundo valor (que não deve ser nulo). Enquanto for fornecido
		um valor nulo a leitura deve ser repetida. Utilize a estrutura Repita/Até na construção da repetição
		de validação. 
		*/

		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double num1, num2 = 0;
		
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
