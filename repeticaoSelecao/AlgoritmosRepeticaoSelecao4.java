package repeticaoSelecao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosRepeticaoSelecao4{

	public static double num1, num2 = 0;
	public static Scanner teclado = new Scanner(System.in);
	public static DecimalFormat df = new DecimalFormat("##.##");	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		divisaoDoisNum();
		
	}

	private static void divisaoDoisNum() {
		
		System.out.print("Digite o primeiro valor: ");
		num1 = teclado.nextDouble();
		
		System.out.print("Digite o segundo valor: ");
		num2 = teclado.nextDouble();
		
		do {
			
			if( num2 <= 0 ) {
				System.out.print("Valor inválido!");
				num2 = teclado.nextDouble();
			}
			
		}while ( num2 <= 0 );
		
		System.out.print("Resultado: "+(num1 / num2));
	}

}
