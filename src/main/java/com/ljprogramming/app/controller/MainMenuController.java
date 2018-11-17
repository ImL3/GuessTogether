package com.ljprogramming.app.controller;

import com.ljprogramming.app.Navigation;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainMenuController implements Controller{

    private Navigation navigation;

    @FXML
    private ImageView imgTitle;

    @FXML
    private ImageView imgPlay;

    @FXML
    private ImageView imgOptions;

    @FXML
    private ImageView imgExit;


    @FXML
    void onPlayClick(MouseEvent event) {

    }

    @FXML
    void onPlayMouseExit(MouseEvent event) {

    }

    @FXML
    void onPlayMouseHover(MouseEvent event) {

    }

    @FXML
    void onOptionsClick(MouseEvent event) {

    }

    @FXML
    void onOptionsMouseExit(MouseEvent event) {

    }

    @FXML
    void onOptionsMouseHover(MouseEvent event) {

    }

    @FXML
    void onExitClick(MouseEvent event) {

    }

    @FXML
    void onExitMouseExit(MouseEvent event) {

    }

    @FXML
    void onExitMouseHover(MouseEvent event) {

    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }
}
