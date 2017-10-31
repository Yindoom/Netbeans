/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionaire;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import questionaire.MainWindowController;


/**
 * FXML Controller class
 *
 * @author Yindo
 */
public class QuestionWindowController implements Initializable {
    
    private MainWindowController MWC;
    @FXML
    private Label questNameLabel;

  /*  @FXML
   public Label questNameLabel;
    {
        System.out.println(MWC.getName());
    }*/

    public QuestionWindowController()
    {

    }
   
    
        
    
    
    

    /**
     * Initializes the controller class.
     */
    @Override 
    public void initialize(URL url, ResourceBundle rb) {
                questNameLabel.setText(MainWindowController.name);
    }    
    
    
    
    
}