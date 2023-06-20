package hust.soict.globalict.aims.screen.add;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;

public class AddDigitalVideoDiscToStoreScreenController {

    @FXML
    private TextField fieldCategory;

    @FXML
    private TextField fieldDirector;

    @FXML
    private TextField fieldTitle;

    @FXML
    private Label labelLength;

    @FXML
    private Slider sliderLength;

    @FXML
    private Spinner<Double> spinnerCost = new Spinner(0, 100, 0, 0.05);

    @FXML
    void initialize() {
    	sliderLength.valueProperty().addListener((observable, oldValue, newValue) -> {
            labelLength.setText((int) newValue.doubleValue() + " mins");
        });
    }

    
    @FXML
    void addBookScreen(ActionEvent event) {

    }

    @FXML
    void addCDScreen(ActionEvent event) {

    }

    @FXML
    void addDVD(ActionEvent event) {

    }

    @FXML
    void viewCartScreen(ActionEvent event) {

    }

    @FXML
    void viewStoreScreen(ActionEvent event) {

    }

}
