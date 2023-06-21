package hust.soict.globalict.test.oldunused;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import hust.soict.globalict.aims.cart.Cart;
// import hust.soict.globalict.aims.store.*;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class AimsGUI {
	private static final int MODE_ADD = 1;
	private static final int MODE_REMOVE = 2;
	private static int appmode = MODE_ADD;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",	"Animation",		"Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",		"Science Fiction",	"George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",			"Animation", 		18.99f);
		
		anOrder.addMedia(dvd1);
		anOrder.addMedia(dvd2);
		anOrder.addMedia(dvd3);

		System.out.println("Total Cost: " + anOrder.totalCost());
		
		anOrder.removeMedia(dvd2);
		System.out.println("Total Cost after removing Star Wars 24.95: " + anOrder.totalCost() +"\n");
		
		System.out.println("More testings:");
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 192, 12.44f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar: Way of the Water", "Science Fiction", "James Cameron", 27.98f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Top Gun: Maverick", "Action", 22.25f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Everything Everywhere All at Once ", "Comedy", "Daniel Kwan", 139, 46.23f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Uncharted", "Adventure", 25.85f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Jurassic World: Dominion", "Action", 147, 36.77f);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("The Father", "Drama", 97, 25.9f);
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("Judas and the Black Messiah", "Crime", 45.98f);
		DigitalVideoDisc dvd12 = new DigitalVideoDisc("CODA", "Comedy", 38.25f);
		DigitalVideoDisc dvd13 = new DigitalVideoDisc("Cruella", "Crime", "Craig Gillespie", 134, 35.55f);
		DigitalVideoDisc dvd14 = new DigitalVideoDisc("Black Panther", "Action", 47.6f);
		DigitalVideoDisc dvd15 = new DigitalVideoDisc("Parasite", "Thriller", "Bong Joon-ho", 132, 19.42f);
		DigitalVideoDisc dvd16 = new DigitalVideoDisc("Promising Young Woman");
		DigitalVideoDisc dvd17 = new DigitalVideoDisc("La La Land ", "Romance, Musical", 19.66f);
		DigitalVideoDisc dvd18 = new DigitalVideoDisc("Soul", "Animation", 101, 46.96f);
		DigitalVideoDisc dvd19 = new DigitalVideoDisc("Joker", "Thriller", 122, 30f);
		DigitalVideoDisc dvd20 = new DigitalVideoDisc("Toy Story 4", "Animation", 100, 17.01f);
		DigitalVideoDisc dvd21 = new DigitalVideoDisc("Toy Story 5", "Animation", 100, 17.01f);
		DigitalVideoDisc dvd22 = new DigitalVideoDisc("Toy Story 6", "Animation", 100, 17.01f);
		DigitalVideoDisc dvd23 = new DigitalVideoDisc("Toy Story 7", "Animation", 100, 17.01f);
		DigitalVideoDisc dvd24 = new DigitalVideoDisc("Toy Story 8", "Animation", 100, 17.01f);
		DigitalVideoDisc dvd25 = new DigitalVideoDisc("Toy Story 9", "Animation", 100, 17.01f);
		DigitalVideoDisc dvd26 = new DigitalVideoDisc("Toy Story 10", "Animation", 100, 17.01f);

		DigitalVideoDisc dvdlist[] = {
				dvd1, dvd2, dvd3, dvd4, dvd5, 
				dvd6, dvd7, dvd8, dvd9, dvd10, 
				dvd11, dvd12, dvd13, dvd14, dvd15, 
				dvd16, dvd17, dvd18, dvd19, dvd20,
				dvd21, dvd22, dvd23, dvd24, dvd25
		};
		
		JFrame frame = new JFrame("DVD Store");
		JPanel panel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(0, 5, 5, 0); // add 5 pixels of padding

		gbc.gridwidth = 1;
		gbc.gridheight = 4;
		gbc.gridy = 1;
		gbc.gridx = 0;
		gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        JTextArea dvdtext = new JTextArea(anOrder.getContentAllMedia());
        dvdtext.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(dvdtext);
		scrollPane.setPreferredSize(new Dimension(80, 100));
        panel.add(scrollPane, gbc);
		

		gbc.gridx = 0;
        gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.BOTH;
		
		// Smaller panel
		JPanel labelpanel = new JPanel(new GridLayout(4, 1));
		JRadioButton radioButton1 = new JRadioButton("Add DVD"); radioButton1.setSelected(true);
		JRadioButton radioButton2 = new JRadioButton("Remove DVD");
		JLabel cartLabel = new JLabel("Cart");
		JLabel costLabel = new JLabel();
		
		ButtonGroup group = new ButtonGroup();
		group.add(radioButton1);
		group.add(radioButton2);
		radioButton1.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { appmode = MODE_ADD; } });
		radioButton2.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { appmode = MODE_REMOVE; } });
		
		labelpanel.add(radioButton1);
		labelpanel.add(radioButton2);
		labelpanel.add(cartLabel);
		labelpanel.add(costLabel);
		labelpanel.setPreferredSize(new Dimension(50, 50));
		panel.add(labelpanel, gbc);

		
        for (int i = 0; i < dvdlist.length; i++) {
        	DigitalVideoDisc d = dvdlist[i];
			gbc.gridy = i / 4;
			gbc.gridx = 2 + i % 4;
        	
            JButton button = new JButton("<html>" + d.getTitle() + "<br/>($" + d.getCost() + ")</html>");
            button.setPreferredSize(new Dimension(50, 50));
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                	String warning = "";
                	if (appmode == MODE_ADD) {
                    	warning = anOrder.addMedia(d);		
                	} else if (appmode == MODE_REMOVE) {
                		warning = anOrder.removeMedia(d);
                	}
            		dvdtext.setText(anOrder.getContentAllMedia());
            		cartLabel.setText("Cart      " + warning);
            		costLabel.setText("Total: $" + String.format("%.2f", anOrder.totalCost()) );
                }
            });
            panel.add(button, gbc);
        }
        
		JScrollPane bigScrollPane = new JScrollPane(panel);
		bigScrollPane.setPreferredSize(new Dimension(700, 400));
		
        frame.getContentPane().add(bigScrollPane);
        frame.pack();
        frame.setVisible(true);
	}

}
