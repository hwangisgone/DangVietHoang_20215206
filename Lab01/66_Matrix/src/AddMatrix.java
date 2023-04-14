import java.util.Scanner;

public class AddMatrix {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter the size (row columns) of the matrices: ");
		int row = keyboard.nextInt();
		int col = keyboard.nextInt();

		// Create matrices
		int[][] matrix1 = new int[row][col];
		int[][] matrix2 = new int[row][col];
		int[][] sum = new int[row][col];

		// Input matrix 1
		System.out.println("Enter the first matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix1[i][j] = keyboard.nextInt();
			}
		}

		// Input matrix 2
		System.out.println("Enter the second matrix:");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix2[i][j] = keyboard.nextInt();
			}
		}

		// Add matrices
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		// Print matrices and their sum
		System.out.println("Matrix 1:");
		printMatrix(matrix1);
		System.out.println("Matrix 2:");
		printMatrix(matrix2);
		System.out.println("Sum of two matrices:");
		printMatrix(sum);

		keyboard.close();
	}

	private static void printMatrix(int[][] mat) {
		int row = mat.length;
		int col = mat[0].length;

		for (int i = 0; i < row; i++) {
			System.out.print("| ");
			for (int j = 0; j < col; j++) {
				System.out.printf("%-3d ", mat[i][j]);
			}
			System.out.println("|");
		}
	}

}