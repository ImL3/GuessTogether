package com.ljprogramming.app.controller;

import com.ljprogramming.app.Navigation;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

public class MainMenuController implements Controller{

    private Navigation navigation;

    @FXML
    private GridPane gridButtons;

    @FXML
    private ImageView imgShapeHolder;

    @FXML
    private ImageView imgPlayButton;

    @FXML
    private ImageView imgOptionsButton;

    @FXML
    private ImageView imgExitButton;

    @FXML
    private ImageView imgTitle;

    @FXML
    void onExitButtonClick(MouseEvent event) {
        System.exit(0);
    }

    @FXML
    void onExitButtonEnter(MouseEvent event) {

    }

    @FXML
    void onExitButtonExit(MouseEvent event) {

    }

    @FXML
    void onOptionsButtonClick(MouseEvent event) {

    }

    @FXML
    void onOptionsButtonEnter(MouseEvent event) {

    }


    @FXML
    void onOptionsButtonExit(MouseEvent event) {

    }

    @FXML
    void onPlayButtonClick(MouseEvent event) {

    }

    @FXML
    void onPlayButtonEnter(MouseEvent event) {

    }

    @FXML
    void onPlayButtonExit(MouseEvent event) {

    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }
}
