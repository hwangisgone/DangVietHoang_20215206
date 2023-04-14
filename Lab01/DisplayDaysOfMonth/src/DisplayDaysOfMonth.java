import java.util.HashMap;
import java.util.Scanner;

public class DisplayDaysOfMonth {
	private static HashMap<String, Integer> Months = new HashMap<>();
	
	static {
		Months.put("january", 1);
		Months.put("jan", 1);
		Months.put("1", 1);
		Months.put("february", 2);
		Months.put("feb", 2);
		Months.put("2", 2);
		Months.put("march", 3);
		Months.put("mar", 3);
		Months.put("3", 3);
		Months.put("april", 4);
		Months.put("apr", 4);
		Months.put("4", 4);
		Months.put("may", 5);
		Months.put("5", 5);
		Months.put("june", 6);
		Months.put("jun", 6);
		Months.put("6", 6);
		Months.put("july", 7);
		Months.put("jul", 7);
		Months.put("7", 7);
		Months.put("august", 8);
		Months.put("aug", 8);
		Months.put("8", 8);
		Months.put("september", 9);
		Months.put("sep", 9);
		Months.put("9", 9);
		Months.put("october", 10);
		Months.put("oct", 10);
		Months.put("10", 10);
		Months.put("november", 11);
		Months.put("nov", 11);
		Months.put("11", 11);
		Months.put("december", 12);
		Months.put("dec", 12);
		Months.put("12", 12);
	}
	public static void main(String[] args) {
		String monthStr;
		int month, year, days = 0;
		
		Scanner keyboard = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a month (e.g. January, Jan., jan, or 1): ");
			monthStr = keyboard.nextLine().toLowerCase();
			if (monthStr.endsWith(".")) {
				monthStr = monthStr.substring(0, monthStr.length() - 1);
			}	// Remove last dot if exising
			
			if (Months.containsKey(monthStr)) {
				month = Months.get(monthStr);
				break;
			} else {
				System.out.println("Invalid month input, please try again.\n");
			}			
		}
		
		while (true) {
			System.out.print("Enter a year (non-negative): ");
			year = keyboard.nextInt();
			if (year >= 0) { 
				break;
			} else {
				System.out.println("Invalid year input.\n");
			}
		}
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
					days = 29;
				} else {
					days = 28;
				}
				break;
		}
		
		System.out.printf("There are %d days in %s of %d.\n", days, monthStr, year);
		
		keyboard.close();
	}
}
