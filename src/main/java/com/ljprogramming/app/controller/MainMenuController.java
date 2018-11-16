package com.ljprogramming.app.controller;

import com.ljprogramming.app.Navigation;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class MainMenuController {

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
    void onOptionsClick(MouseEvent event) {

    }

    @FXML
    void onExitClick(MouseEvent event) {

    }

    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }
}
