package application;
import java.util.Scanner;

public class MatrixApplication {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		int[][] matrix = new int[n][n];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scan.nextInt();

			}

		}
		
		diagonalAndNegative(matrix);

		scan.close();

	}

	public static void diagonalAndNegative(int[][] matrix) {

		int negativo =0;
		System.out.println("Diagonal principal:");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j< matrix[i].length; j++) {
				if (i == j) {
					System.out.printf("%d ", matrix[i][j]);
					
				} if(matrix[i][j] < 0) {
					negativo+=1;
				}
				
			}
			
		}
		System.out.printf("\nQuantidades de números negativos: %d", negativo);
		
		

	}

}
