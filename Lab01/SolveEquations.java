package hello;

import javax.swing.*;

public class Ex226_SolveEquations {
	static void manyField() {
		JTextField field_a11 = new JTextField(5);
		JTextField field_a12 = new JTextField(5);
		JTextField field_b1 = new JTextField(5);
		JTextField field_a21 = new JTextField(5);
		JTextField field_a22 = new JTextField(5);
		JTextField field_b2 = new JTextField(5);
	
		JPanel inputPanel = new JPanel();
		inputPanel.add(new JLabel("<html>"));
		inputPanel.add(new JLabel("a11:")); inputPanel.add(field_a11);
		inputPanel.add(new JLabel("a12:")); inputPanel.add(field_a12);
		inputPanel.add(new JLabel("b1:")); inputPanel.add(field_b1);
		inputPanel.add(new JLabel("<br>a21:")); inputPanel.add(field_a21);
		inputPanel.add(new JLabel("a22:")); inputPanel.add(field_a22);
		inputPanel.add(new JLabel("b2:")); inputPanel.add(field_b2);
		inputPanel.add(new JLabel("</html>"));
		


		int result = JOptionPane.showConfirmDialog(null, inputPanel, 
	               "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {
			System.out.println("x value: " + field_a11.getText());
			System.out.println("y value: " + field_b1.getText());
		}
//		JPanel myPanel = new JPanel();
//
//		myPanel.add(Box.createHorizontalStrut(15)); // a spacer
//		myPanel.add(new JLabel("y:"));
//		myPanel.add(yField); 
		}

	
	static void firstDegreeEqn() {
		double a, b;
		a = Double.parseDouble(
				JOptionPane.showInputDialog(null,
				"ax + b = 0\nInput a: ",
				"First-degree equation 1 variable",
				JOptionPane.INFORMATION_MESSAGE));
		
		while (a == 0.0) {
			a = Double.parseDouble(
					JOptionPane.showInputDialog(null,
					"ax + b = 0\\nInput a (non-zero): ",
					"Variable a must be non-zero",
					JOptionPane.ERROR_MESSAGE));
		}
		
		b = Double.parseDouble(
				JOptionPane.showInputDialog(null,
				a+"x + b = 0"
				+ "\nInput b: ",
				"First-degree equation 1 variable",
				JOptionPane.INFORMATION_MESSAGE));
		
		JOptionPane.showMessageDialog(null,
				a+"x"+(b < 0 ? " - " : " + ")+b+" = 0" 
				+ "\nx = " + (-b/a),
				"Results of first-degree equations", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void main(String[] args) {
		// System.out.println("Hello me");
		String[] options = {
				"First-degree equation 1 variable", 
				"First-degree equations 2 variables", 
				"Second-degree equation 1 variable", 
				"Exit"
		};
		
		while (true) {
			int chosen = JOptionPane.showOptionDialog(null,
					"Equations Calculator",
	                "What do you want to calculate?",
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
	                options, options[0]);
			
			switch(chosen) {
				case 0:
					firstDegreeEqn();
					break;
				case 1:
					manyField();
					break;
				case 2:
					break;
				case 3:
					System.exit(0);
					break;
			}
		}
	}
}
