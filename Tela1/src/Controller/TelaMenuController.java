/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import Main.Tela1;
import Main.TelaDez;
import Main.Tela2;
import Main.Tela3;
import Main.Tela4;
import Main.Tela5;
import Main.Tela6;
import Main.Tela7;
import Main.Tela8;
import Main.Tela9;


/**
 * FXML Controller class
 *
 * @author Aluno
 */
public class TelaMenuController implements Initializable {

    @FXML private Button bttela1;
    @FXML private Button bttela2;
    @FXML private Button bttela3;
    @FXML private Button bttela4;
    @FXML private Button bttela5;
    @FXML private Button bttela6;
    @FXML private Button bttela7;
    @FXML private Button bttela8;
    @FXML private Button bttela9;
    @FXML private Button bttela10;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        bttela1.setOnMouseClicked((MouseEvent e)->{
           Tela1 Tela1 = new Tela1();
            try {  
                Tela1.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        bttela2.setOnMouseClicked((MouseEvent e)->{
           Tela2 Tela2 = new Tela2();
            try {  
                Tela2.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
    
        bttela3.setOnMouseClicked((MouseEvent e)->{
           Tela3 Tela3 = new Tela3();
            try {  
                Tela3.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        bttela4.setOnMouseClicked((MouseEvent e)->{
           Tela4 Tela4 = new Tela4();
            try {  
                Tela4.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        
        bttela5.setOnMouseClicked((MouseEvent e)->{
           Tela5 Tela5 = new Tela5();
            try {  
                Tela5.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        
        bttela6.setOnMouseClicked((MouseEvent e)->{
           Tela6 Tela6 = new Tela6();
            try {  
                Tela6.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        
             bttela7.setOnMouseClicked((MouseEvent e)->{
           Tela7 Tela7 = new Tela7();
            try {  
                Tela7.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });    
    
             bttela8.setOnMouseClicked((MouseEvent e)->{
           Tela8 Tela8 = new Tela8();
            try {  
                Tela8.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
             
             bttela9.setOnMouseClicked((MouseEvent e)->{
           Tela9 Tela9 = new Tela9();
            try {  
                Tela9.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
             
             bttela10.setOnMouseClicked((MouseEvent e)->{
           TelaDez TelaDez = new TelaDez();
            try {  
                TelaDez.start(new Stage());
            } catch (Exception ex) {
                Logger.getLogger(TelaMenuController.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
    
    } 
    
}
