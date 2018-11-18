package com.ljprogramming.app.controller;

import com.ljprogramming.app.Navigation;
import com.ljprogramming.app.util.enums.ButtonType;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainMenuController implements Controller {

    private Navigation navigation;

    @FXML
    private BorderPane borderPane;

    @FXML
    private VBox vboxCenter;

    @FXML
    private HBox hboxCenterChild;

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
    private HBox vboxBottom;

    @FXML
    private VBox vboxRight;

    @FXML
    private VBox vboxTop;

    @FXML
    private HBox hboxTopChild;

    @FXML
    private ImageView imgTitle;

    @FXML
    private VBox vboxLeft;

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

    private void moveShapeHolderToButton(ButtonType currentButton){
        int buttonRowIndex = getButtonRowIndex(currentButton);
        GridPane.setRowIndex(imgShapeHolder,buttonRowIndex);
    }

    private int getButtonRowIndex(ButtonType buttonType){

        int buttonRowIndex;

        switch (buttonType){
            case PLAY:
                buttonRowIndex = GridPane.getRowIndex(imgPlayButton);
                break;
            case OPTIONS:
                buttonRowIndex = GridPane.getRowIndex(imgOptionsButton);
                break;

            case EXIT:
                buttonRowIndex = GridPane.getRowIndex(imgExitButton);
                break;

            default:
                buttonRowIndex = GridPane.getRowIndex(imgShapeHolder);
                System.out.println("Unknown button");
                break;
        }

        return buttonRowIndex;
    }


    public void setNavigation(Navigation navigation) {
        this.navigation = navigation;
    }
}
