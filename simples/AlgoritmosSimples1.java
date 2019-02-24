package simples;

import java.text.DecimalFormat;
import java.util.*;

public class AlgoritmosSimples1 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in); 
		
		double raio = 0;
		
		System.out.print("Digite um valor para o raio: ");
		raio = teclado.nextDouble();
			
		DecimalFormat df = new DecimalFormat("##.##");
		
		System.out.println("A área é: "+df.format(calcularArea(raio)));
		
	}
	
	private static double calcularArea( double raio ) {
		double pi = 3.14159;
		return pi*(raio*raio);
	}

}
