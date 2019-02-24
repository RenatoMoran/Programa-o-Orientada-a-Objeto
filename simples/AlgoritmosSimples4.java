package simples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSimples4 {

	private static Scanner teclado;

	public static void main(String[] args) {
		/*
		4) Escreva um programa para calcular e imprimir o número de lâmpadas necessárias para iluminar um
		determinado cômodo de uma residência. Dados de entrada: a potência da lâmpada utilizada (em
		watts), as dimensões (largura e comprimento, em metros) do cômodo. Considere que a potência
		necessária é de 18 watts por metro quadrado
		 */
		
		teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double potLampada, largDim, CompDim, AreaDim, PotTotal = 0;
		
		System.out.print("Qual a potência da lâmpada? ");
		potLampada = teclado.nextDouble();
		
		System.out.print("Qual a largura do cômodo? ");
		largDim = teclado.nextDouble();
		
		System.out.print("Qual o comprimento do cômodo? ");
		CompDim = teclado.nextDouble();
		
		AreaDim = largDim * CompDim;
		PotTotal = AreaDim * 18;
		
		System.out.print("O total de lâmpadas é: "+calNumLamp(PotTotal , potLampada));
	}

	private static int calNumLamp( double PotTotal , double potLampada ) {
		return ( int ) (PotTotal / potLampada);
	}
	
}
