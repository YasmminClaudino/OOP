package application;

import java.util.Scanner;

public class MatrixApplication2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int m, n;

		m = scan.nextInt();
		n = scan.nextInt();

		int[][] matrix = new int[m][n];

		preencheMatrix(matrix, scan);

		int number = scan.nextInt();

		findInMatrix(matrix, number);

		// imprimeMatrix(matrix);

		scan.close();

	}

	public static void preencheMatrix(int[][] matrix, Scanner scan) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
	}

	public static void findInMatrix(int[][] matrix, int number) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == number) {
					System.out.printf("Position %d, %d:\n", i, j);
					adjacentsElements(matrix, i, j);
				}

			}
		}
	}

	public static void adjacentsElements(int[][] matrix, int i, int j) {

		if (i - 1 >= 0) {
			int up = matrix[i - 1][j];
			System.out.println("Up: " + up);
		}
		if (i + 1 < matrix.length) {
			int down = matrix[i + 1][j];
			System.out.println("Down: " + down);

		}
		if (j - 1 >= 0) {
			int left = matrix[i][j - 1];
			System.out.println("Left: " + left);
		}
		if (j + 1 < matrix[i].length) {
			int right = matrix[i][j + 1];
			System.out.println("Right: " + right);
		}

	}

	public static void imprimeMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println("");
		}

	}
}