package com.ljprogramming.app;

import com.ljprogramming.app.controller.Controller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class Navigation {

    private final String VIEW_PATH = "/view";

    private Map<String,Controller> controllers;
    private LinkedList<Scene> scenes;
    private Stage stage;

    private static Navigation instance;


    public Navigation(){
    }

    public static Navigation getInstance(){
        if(instance == null){
            instance = new Navigation();
        }

        return instance;
    }

    public void loadScreen(String viewName){

        Parent root;

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(VIEW_PATH + "/" + viewName + "/"));

            fxmlLoader.setControllerFactory(new Callback<Class<?>, Object>() {
                @Override
                public Object call(Class<?> param) {
                    return controllers.get(param.getSimpleName());
                }
            });

            root = fxmlLoader.load();

            Scene scene = new Scene(root);
            scenes.push(scene);

            setScene(scene);

        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    private void setScene(Scene scene) {
        stage.setScene(scene);
        stage.setTitle("Guess Together");
        stage.show();
    }

    private void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setControllers(Map<String, Controller> controllers) {
        this.controllers = controllers;
    }
}
