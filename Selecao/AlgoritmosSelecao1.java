package Selecao;

import java.util.Scanner;

public class AlgoritmosSelecao1 {

	public static void main(String[] args) {
		/*
		 AlgoritmosSelecao1
		 */
		
		Scanner teclado = new Scanner(System.in); 
		int num = 0;
		
		System.out.println("C�digo 1: Sul");
		System.out.println("C�digo 2: Norte");
		System.out.println("C�digo 3: Leste");
		System.out.println("C�digo 4: Oeste");
		System.out.println("C�digo 5: Nordeste");
		System.out.println("C�digo 6: Nordeste");
		System.out.println("C�digo 7: Sudeste");
		System.out.println("C�digo 8: Sudeste");
		System.out.println("C�digo 9: Sudeste");
		System.out.println("C�digo 10: Centro-Oeste");
		System.out.println("C�digo 11: Noroeste");
		System.out.println("C�digo 12: Sair do programa");
		System.out.println("Caso o c�digo seja diferente dos citados acima: Importado");
		System.out.print("Digite o c�digo do produto: ");
		
		num = teclado.nextInt();
		
		if( num == 12 ) {
			System.out.println("Encerrando o programa!");
		}
		
		while( num != 12) {
			
			gerarRegiao( num );
			
			System.out.print("Digite outro c�digo de produto: ");
			
			num = teclado.nextInt();
			
		}
		
		if( num == 12 ) {
			System.out.println("Encerrando o programa!");
		}
		
	}
	
	private static void gerarRegiao( int num ) {
		if( num == 1 ) {
			
			System.out.println("Sul");
			
		}else if( num == 2 ) {
			
			System.out.println("Norte");
			
		}else if( num == 3 ) {
			
			System.out.println("Leste");
			
		}else if( num == 4 ) {
			
			System.out.println("Oeste");
			
		}else if( num == 5 || num == 6 ) {
			
			System.out.println("Nordeste");
			
		}else if( num == 7 || num == 8 || num == 9 ) {
			
			System.out.println("Sudeste");
			
		}else if( num == 10 ) {
			
			System.out.println("Centro-Oeste");
			
		}else if( num == 11 ) {
			
			System.out.println("Noroeste");
			
		}else if( num != 12 ) {
			
			System.out.println("Importado");
			
		}		
	
	}

}
