/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

/**
 *
 * @author Yindo
 */
public class NumberConversionController implements Initializable {
    private NumberConversionModel ncmodel;
    
    private Label label;
    @FXML
    private Button btnCalculate;
    @FXML
    private Label lblResult;
    @FXML
    private TextField txtNumberInput;

    public NumberConversionController() {
        this.ncmodel = new NumberConversionModel();
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        double txtFieldValue = Double.parseDouble(txtNumberInput.getText());
        double resultInMiles = ncmodel.getMilesFromKilometers(txtFieldValue);
        String resultAsString = String.valueOf(resultInMiles);
        lblResult.setText(resultAsString);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    
    
}
