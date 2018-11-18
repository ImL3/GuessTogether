package com.ljprogramming.app.util.enums;

import javafx.scene.image.Image;

public enum Shape {

    TRIANGLE("Triangle"),
    POLYGON("Polygon"),
    CIRCLE("Circle");

    private String shapeName;

    Shape(String shapeName){
        this.shapeName = shapeName;
    }

}
