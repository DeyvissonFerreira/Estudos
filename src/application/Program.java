package application;
import java.util.Locale;
import java.util.Scanner;


public class Program {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com a linha e coluna da matriz:");
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		int[][] matriz = new int[l][c];
		
		
		sc.nextLine();
		System.out.println("Entre com a composição da matriz:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				int var = sc.nextInt();
				matriz[i][j] = var; 
			}
		}
		
		/**
		 * Imprime a matriz.
		 */
		
		sc.nextLine();
		System.out.println("Matriz impressa:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("Qual o número a ser verificado?");
		int n = sc.nextInt();
		
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (n == matriz[i][j]) {
					System.out.println("Position " + i + ", " + j);
					
					if (j != 0) 
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					if (j != matriz[i].length - 1) 
						System.out.println("Direita: " + matriz[i][j + 1]);
					if (i != 0) 
						System.out.println("Em cima: " + matriz[i - 1][j]);
					if (i != matriz.length  - 1)
						System.out.println("Embaixo: " + matriz[i + 1][j]);
				}
			}
		}
		
		sc.close();
	}

}
