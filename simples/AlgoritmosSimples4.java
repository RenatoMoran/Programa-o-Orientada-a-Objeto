package simples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlgoritmosSimples4 {

	private static Scanner teclado;

	public static void main(String[] args) {
		/*
		4) Escreva um programa para calcular e imprimir o n�mero de l�mpadas necess�rias para iluminar um
		determinado c�modo de uma resid�ncia. Dados de entrada: a pot�ncia da l�mpada utilizada (em
		watts), as dimens�es (largura e comprimento, em metros) do c�modo. Considere que a pot�ncia
		necess�ria � de 18 watts por metro quadrado
		 */
		
		teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##.##");
		
		double potLampada, largDim, CompDim, AreaDim, PotTotal = 0;
		
		System.out.print("Qual a pot�ncia da l�mpada? ");
		potLampada = teclado.nextDouble();
		
		System.out.print("Qual a largura do c�modo? ");
		largDim = teclado.nextDouble();
		
		System.out.print("Qual o comprimento do c�modo? ");
		CompDim = teclado.nextDouble();
		
		AreaDim = largDim * CompDim;
		PotTotal = AreaDim * 18;
		
		System.out.print("O total de l�mpadas �: "+calNumLamp(PotTotal , potLampada));
	}

	private static int calNumLamp( double PotTotal , double potLampada ) {
		return ( int ) (PotTotal / potLampada);
	}
	
}
