/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



/**
 *
 * @author Yindo
 */
public class MainWindowController implements Initializable {
   
	private final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @FXML
    private Button button;
    
   @FXML
    private TextField nameLabel; 
   
    public static String name;
    
   public void setName(String name)
   { 
       MainWindowController.name = name;
   }
   
   public String getName()
   {
       return name;
   }
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        //setName(name);
        name = nameLabel.getText();
        Parent root = FXMLLoader.load(getClass().getResource("QuestionWindow.fxml"));
        
        Scene scene = new Scene(root);
        
         Stage stage = (Stage) button.getScene().getWindow();
        
     //   Stage stage = new stage(); // Create new stage
        
        stage.setScene(scene);
        //System.out.println(name);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    
    @FXML 
    private void nameField(ActionEvent event) throws IOException {
         MainWindowController.name = nameLabel.getText();
         //System.out.println(nameLabel.getText());
                
    }
    
    
}

