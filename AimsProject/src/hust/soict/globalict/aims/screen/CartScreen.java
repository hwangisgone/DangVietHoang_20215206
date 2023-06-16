package hust.soict.globalict.aims.screen;

import java.io.IOException;

import javax.swing.JFrame;

import hust.soict.globalict.aims.cart.Cart;

public class CartScreen extends JFrame {
	private Cart cart;
	
	public CartScreen (Cart cart) {
		super();
		
		this.cart = cart;
		
		JFXPanel fxPanel = new JFXPanel();
		this.add(fxPanel);
		
		this.setTitle("Cart");
		this.setVisible(true);
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				try {
					FXMLLoader loader = new FXMLLoader(getClass()
							.getResource("cart.fxml"));
					CartScreenController controller = new CartScreenController(cart);
					loader.setController(controller);
					
					Parent root = loader.load();
					fxPanel.setScene(new Scene(root));
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
