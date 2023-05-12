import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class CalcTwoNumbers {

	public static void main(String[] args) {
		// System.out.println("Hello me");
		
		String str1, str2;
		str1 = JOptionPane.showInputDialog(null,
				"Input first double: ",
				"Input the first number",
				JOptionPane.INFORMATION_MESSAGE);
		
		str2 = JOptionPane.showInputDialog(null,
				"Input second double: ",
				"Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		
		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);
		
		String msgSum = "Sum:\t" + str1 + " + " + str2 + " = " + (num1 + num2);
		String msgDiff = "\nDifference:\t" + str1 + " - " + str2 + " = " + (num1 - num2);
		String msgProd = "\nProduct:\t" + str1 + " x " + str2 + " = " + (num1 * num2);
		String msgDiv = "\nQuotient:\t";
		
		if (num2 == 0) {
			msgDiv += "Cannot divide by 0\n";
		} else {
			msgDiv += str1 + " / " + str2 + " = " + String.format("%.3f", num1 / num2);
		}
		
		JOptionPane.showMessageDialog(null,
				new JTextArea(msgSum + msgDiff + msgProd + msgDiv),
				"Results of calculation", 
				JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}
