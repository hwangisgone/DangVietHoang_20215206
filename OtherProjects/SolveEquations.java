import java.awt.*;
import javax.swing.*;

public class SolveEquations {
	private static String sadd(double n) {
		return (n < 0 ? "- " + Math.abs(n) : "+ " + n);
	}
	private static String sadd(int n) {
		return (n < 0 ? "- " + Math.abs(n) : "+ " + n);
	}
	
	public static void manyField() {
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 5, 5, 0); // add 5 pixels of padding

		String[] varStr = {
				"a<sub>11</sub>", "a<sub>12</sub>", "b<sub>1</sub>",
				"a<sub>21</sub>", "a<sub>22</sub>", "b<sub>2</sub>",
				"x<sub>1</sub>", "x<sub>2</sub>"};
		
		String strSol;
		String strEqn = String.format("<html>%s%s + %s%s = %s"
									 + "<br/>%s%s + %s%s = %s</html>", 
									 varStr[0], varStr[6], varStr[1], varStr[7], varStr[2],
									 varStr[3], varStr[6], varStr[4], varStr[7], varStr[5]);
		JLabel eqnLabel = new JLabel(strEqn);
		eqnLabel.setFont(eqnLabel.getFont().deriveFont(15f));
		JLabel solLabel = new JLabel("");
		solLabel.setFont(solLabel.getFont().deriveFont(15f));
		gbc.weightx = 1;
		gbc.weighty = 10;
		gbc.gridwidth = 6;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridx = 0; gbc.gridy = 0; panel.add(eqnLabel, gbc);
		gbc.gridx = 0; gbc.gridy = 1; panel.add(solLabel, gbc);
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.NONE;
		JTextField[] textFields = new JTextField[6];
		JLabel varLabel;
		for (int i = 0; i < 6; i++) {
			int posx = (i % 3) * 2;
			gbc.gridy = 2 + i / 3;
			
			gbc.gridx = posx;
			gbc.anchor = GridBagConstraints.EAST;
			varLabel = new JLabel("<html>" + varStr[i] + " =</html>");
			panel.add(varLabel, gbc);
			
			gbc.gridx = posx + 1;
			gbc.anchor = GridBagConstraints.CENTER;
			textFields[i] = new JTextField(8);
			panel.add(textFields[i], gbc);
		}

		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setPreferredSize(new Dimension(400, 200)); // set preferred size for the scroll pane

		double a11, a12, a21, a22, b1, b2;
		int result;

		while (true) {
			result = JOptionPane.showConfirmDialog(null, scrollPane, "Linear system with 2 variables", JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION) {
				a11 = Double.parseDouble(textFields[0].getText());
				a12 = Double.parseDouble(textFields[1].getText());
				b1 = Double.parseDouble(textFields[2].getText());
				a21 = Double.parseDouble(textFields[3].getText());
				a22 = Double.parseDouble(textFields[4].getText());
				b2 = Double.parseDouble(textFields[5].getText());
				
				strEqn = String.format("<html>%s%s %s%s = %s"
									 + "<br/>%s%s %s%s = %s</html>", 
									 a11, varStr[6], sadd(a12), varStr[7], b1,
									 a21, varStr[6], sadd(a22), varStr[7], b2);
				
				eqnLabel.setText(strEqn);

				// Calculate solution
				double det = a11 * a22 - a21 * a12;
				double detx = b1 * a22 - b2 * a12;
				double dety = a11 * b2 - a21 * b1;
				
				if (det == 0) {
					if (b1 / a11 == b2 / a21) {
						strSol = "Infinite solutions.";
					} else {
						strSol = "No solution.";
					}
				} else {
					strSol = String.format("<html>%s = %.3f<br/>%s = %.3f</html>", varStr[6], detx/det , varStr[7], dety/det);
				}

				solLabel.setText(strSol);
				continue;
			} else {
				break;
			}		
		}
	}

	
	static void firstDegreeEqn() {
		// Create a panel to hold the user interface components
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 5, 5, 0); // add 5 pixels of padding

		double a, b;
		JTextField field_a = new JTextField(8);
		JTextField field_b = new JTextField(8);
	
		String strEqn = "ax + b = 0          (a != 0)";
		JLabel eqnLabel = new JLabel(strEqn);
		eqnLabel.setFont(eqnLabel.getFont().deriveFont(20f));
		JLabel solLabel = new JLabel("");
		solLabel.setFont(solLabel.getFont().deriveFont(20f));
		gbc.weightx = 1;
		gbc.weighty = 10;
		gbc.gridwidth = 4;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridx = 0; gbc.gridy = 0; panel.add(eqnLabel, gbc);
		gbc.gridx = 0; gbc.gridy = 1; panel.add(solLabel, gbc);
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0; gbc.gridy = 2; panel.add(new JLabel("a ="), gbc);
		gbc.gridx = 1; gbc.gridy = 2; panel.add(field_a, gbc);
		gbc.gridx = 2; gbc.gridy = 2; panel.add(new JLabel("b ="), gbc);
		gbc.gridx = 3; gbc.gridy = 2; panel.add(field_b, gbc);

		// Wrap the panel in a scroll pane
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setPreferredSize(new Dimension(300, 200)); // set preferred size for the scroll pane

		int result;

		while (true) {
			result = JOptionPane.showConfirmDialog(null, scrollPane, "Linear equation with 1 variable", JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION) {
				String stra = field_a.getText();
				String strb = field_b.getText();
				
				if (stra.isEmpty() || strb.isEmpty()) {
					continue;
				}
				
				a = Double.parseDouble(stra);
				b = Double.parseDouble(strb);
				
				if (a == 0.0) {
					solLabel.setText("a MUST BE NON-ZERO");
					continue;
				}
				
				strEqn = String.format("%sx %s = 0", a, sadd(b));
				eqnLabel.setText(strEqn);
				solLabel.setText(String.format("x = %.3f", -b/a));
			} else {
				break;
			}		
		}
	}
	

	static void secondDegreeEqn() {
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 5, 5, 0); // add 5 pixels of padding

		double a, b, c;
		JTextField field_a = new JTextField(8);
		JTextField field_b = new JTextField(8);
		JTextField field_c = new JTextField(8);
	
		String strEqn = "<html>ax<sup>2</sup> + bx + c = 0          (a != 0)</html>";
		JLabel eqnLabel = new JLabel(strEqn);
		eqnLabel.setFont(eqnLabel.getFont().deriveFont(15f));
		JLabel solLabel = new JLabel("");
		solLabel.setFont(solLabel.getFont().deriveFont(15f));
		gbc.weightx = 1;
		gbc.weighty = 10;
		gbc.gridwidth = 6;
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridx = 0; gbc.gridy = 0; panel.add(eqnLabel, gbc);
		gbc.gridx = 0; gbc.gridy = 1; panel.add(solLabel, gbc);
		
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbc.gridwidth = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.gridx = 0; gbc.gridy = 2; panel.add(new JLabel("a ="), gbc);
		gbc.gridx = 1; gbc.gridy = 2; panel.add(field_a, gbc);
		gbc.gridx = 2; gbc.gridy = 2; panel.add(new JLabel("b ="), gbc);
		gbc.gridx = 3; gbc.gridy = 2; panel.add(field_b, gbc);
		gbc.gridx = 4; gbc.gridy = 2; panel.add(new JLabel("c ="), gbc);
		gbc.gridx = 5; gbc.gridy = 2; panel.add(field_c, gbc);

		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setPreferredSize(new Dimension(400, 200)); // set preferred size

		int result;

		while (true) {
			result = JOptionPane.showConfirmDialog(null, scrollPane, "Linear equation with 1 variable", JOptionPane.OK_CANCEL_OPTION);
			if (result == JOptionPane.OK_OPTION) {
				String stra = field_a.getText();
				String strb = field_b.getText();
				String strc = field_c.getText();
				
				if (stra.isEmpty() || strb.isEmpty() || strc.isEmpty()) {
					continue;
				}
				
				a = Double.parseDouble(stra);
				b = Double.parseDouble(strb);
				c = Double.parseDouble(strc);
				
				if (a == 0.0) {
					solLabel.setText("a MUST BE NON-ZERO");
					continue;
				}
				
				double delta = b * b - 4 * a * c;
				
				if (delta > 0) {
					double root1 = (-b + Math.sqrt(delta)) / (2 * a);
					double root2 = (-b - Math.sqrt(delta)) / (2 * a);
					solLabel.setText(String.format(
							"<html>x<sub>1</sub> = %.3f"
							+ "<br/>x<sub>2</sub> = %.3f</html>", root1, root2));
				} else if (delta == 0.0) {
					double root = -b / (2 * a);
					solLabel.setText(String.format(
							"<html>x<sub>1</sub> = x<sub>2</sub> = %.3f</html>", root));
				} else {
					solLabel.setText("No solution.");
				}
				
				strEqn = String.format("<html>%sx<sup>2</sup> %sx %s = 0</html>", a, sadd(b), sadd(c));
				eqnLabel.setText(strEqn);
			} else {
				break;
			}		
		}
	}
	
	public static void main(String[] args) {
		// System.out.println("Hello me");
		String[] options = {
				"First-degree equation 1 variable", 
				"First-degree equations 2 variables", 
				"Second-degree equation 1 variable", 
				"Exit"
		};
		
		int chosen = JOptionPane.showOptionDialog(null,
				"Equations Calculator",
                "What do you want to calculate?",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, 
                options, options[0]);
		
		switch(chosen) {
			case 0: firstDegreeEqn(); break;
			case 1: manyField(); break;
			case 2: secondDegreeEqn(); break;
			case 3: System.exit(0); break;
		}
	}
}
