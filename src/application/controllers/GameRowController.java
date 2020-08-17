package application.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GameRowController {
    @FXML
    JFXButton launchButton;

    @FXML
    Label gameLabel;

    @FXML
    public void initialize() throws Exception {
        try {
            Controller controller = Controller.getInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void launchGame(ActionEvent e) {
        e.getSource();
        System.out.println(e);
        System.out.println(e.getSource());
    }


}
