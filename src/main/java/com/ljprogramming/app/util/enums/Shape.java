package com.ljprogramming.app.util.enums;

import javafx.scene.image.Image;

public enum Shape {

    TRIANGLE("Triangle"),
    POLYGON("Polygon"),
    CIRCLE("Circle");

    public static final String IMG_SHAPES_PATH = "img/mainmenu/shapes";
    public static final String IMG_EXTENSION = "png";
    public static final String IMG_NAME_SUFFIX = "Shape";

    private String shapeName;

    Shape(String shapeName){
        this.shapeName = shapeName;
    }

}
