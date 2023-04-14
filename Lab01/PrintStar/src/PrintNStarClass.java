import java.util.Scanner;

public class PrintNStarClass {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Input height of n stars = ");
		int n = keyboard.nextInt();
		
		for (int i = n; i > 0; i--) {
			for(int space = 1; space < i; space++) {
				System.out.print(" ");
			}
			int stars = (n - i) * 2 + 1;
			for(int j = 1; j <= stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		keyboard.close();
	}
}
