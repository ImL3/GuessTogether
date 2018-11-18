package com.ljprogramming.app.util.enums;

import javafx.scene.image.Image;

public enum Shape {

    TRIANGLE("Triangle"),
    POLYGON("Polygon"),
    CIRCLE("Circle");

    public static final String IMG_SHAPES_PATH = "img/mainmenu/shapes";
    public static final String IMG_EXTENSION = "png";

    private String shapeName;

    Shape(String shapeName){
        this.shapeName = shapeName;
    }


    public static Image getRandomShapeImage(){
        Image shapeImage = null;
        Shape randomShape = getRandomShape();

        if (randomShape == TRIANGLE){
            shapeImage = new Image(IMG_SHAPES_PATH + "/" + randomShape.shapeName + "." + IMG_EXTENSION );
        }
        else if (randomShape == POLYGON){
            shapeImage = new Image(IMG_SHAPES_PATH + "/" + randomShape.shapeName + "." + IMG_EXTENSION );
        }
        else if (randomShape == CIRCLE){
            shapeImage = new Image(IMG_SHAPES_PATH + "/" + randomShape.shapeName + "." + IMG_EXTENSION );
        }

        return shapeImage;
    }

    public static Shape getRandomShape(){
        int min = 0;
        int max = Shape.values().length - 1;
        int range = (max - min) + 1;
        int random = (int)(Math.random() * range) + min;

        return Shape.values()[random];
    }

}
