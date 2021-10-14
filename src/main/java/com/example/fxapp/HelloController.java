package com.example.fxapp;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


public class HelloController {
    @FXML
    private ImageView userIcon, medalIcon, statIcon, settingIcon, quitIcon;

    @FXML
    private AnchorPane loginPane, medalsPane,statsPane, settingsPane;

    @FXML
    private void handleIconClickAction(MouseEvent event){
        if(event.getTarget() == userIcon){
            updateUI(loginPane, medalsPane, statsPane, settingsPane);
        }else if(event.getTarget() == medalIcon){
            updateUI(medalsPane, statsPane, settingsPane, loginPane);
        }else if(event.getTarget() == statIcon){
            updateUI(statsPane,medalsPane,  settingsPane, loginPane);
        }else if(event.getTarget() == settingIcon){
            updateUI(settingsPane, medalsPane, statsPane, loginPane);
        }
    }

    private void updateUI(AnchorPane pane1, AnchorPane pane2, AnchorPane pane3, AnchorPane pane4) {
        pane1.setVisible(true);
        pane2.setVisible(false);
        pane3.setVisible(false);
        pane4.setVisible(false);
    }

}