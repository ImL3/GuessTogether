package com.ljprogramming.app;

import com.ljprogramming.app.controller.Controller;
import javafx.scene.Scene;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class Navigation {

    private Map<String,Controller> controllers;
    private LinkedList<Scene> scenes;

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

    }

    public void setControllers(Map<String, Controller> controllers) {
        this.controllers = controllers;
    }
}
