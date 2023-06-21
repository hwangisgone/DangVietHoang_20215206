package hust.soict.globalict.aims.screen.add;

import hust.soict.globalict.aims.media.Book;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Track;
import hust.soict.globalict.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AddCompactDiscToStoreScreenController {
	private Store store;
	
    public void setStore(Store store) {
		this.store = store;
	}

    @FXML
    private TextField fieldTitle;
    
	@FXML
    private TextField fieldCategory;

    @FXML
    private TextField fieldArtist;

    @FXML
    private Spinner<Double> spinnerCost;
    
    @FXML
    void initialize() {	
    	RoundedSpinnerMaker.makeRoundedSpinner(spinnerCost, 0, 100, 0, 0.05);
    }

    @FXML
    void addCD(ActionEvent event) {
		CompactDisc newCD = new CompactDisc(
    		fieldTitle.getText(),	
    		fieldCategory.getText(),
    		spinnerCost.getValue().floatValue(),
    		fieldArtist.getText()
		);
		
    	store.addMedia(newCD);
	
    	
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Added CD");
		alert.setHeaderText(null);
		alert.setContentText("The CD " + fieldTitle.getText() + " was added!");
		alert.showAndWait();
		
		
		fieldTitle.clear();	
		fieldCategory.clear();		
		fieldArtist.clear(); 
		spinnerCost.getValueFactory().setValue(0.0);
    }

}
