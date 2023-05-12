package hust.soict.globalict.lab01.array;

import java.util.Scanner;
import java.util.Arrays;

public class SortSumArray {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int n = 0;
        if (keyboard.hasNextInt()) {
        	n = keyboard.nextInt();
        }
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
        	arr[i] = keyboard.nextInt();
        }

        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
        	sum += arr[i];
        }
        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.3f", (double)sum/(double)n);
        
        keyboard.close();
	}

}
