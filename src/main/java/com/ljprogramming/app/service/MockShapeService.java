package com.ljprogramming.app.service;

import com.ljprogramming.app.util.enums.Shape;
import javafx.scene.image.Image;

import static com.ljprogramming.app.util.enums.Shape.*;

public class MockShapeService implements ShapeService{

    private String IMG_SHAPES_PATH = "img/mainmenu/shapes";
    private final String IMG_EXTENSION = "png";
    private final String IMG_NAME_SUFFIX = "Shape";

    @Override
    public Shape getRandomShape() {
        int min = 0;
        int max = Shape.values().length - 1;
        int range = (max - min) + 1;
        int random = (int)(Math.random() * range) + min;

        return Shape.values()[random];
    }

    @Override
    public Image getRandomShapeImage() {

        Shape randomShape = getRandomShape();
        Image shapeImage = null;
        if (randomShape == TRIANGLE){
            shapeImage = new Image(IMG_SHAPES_PATH + "/" + randomShape.name() + IMG_NAME_SUFFIX + "." + IMG_EXTENSION );
        }
        else if (randomShape == POLYGON){
            shapeImage = new Image(IMG_SHAPES_PATH + "/" + randomShape.name() + IMG_NAME_SUFFIX +  "." + IMG_EXTENSION );
        }
        else if (randomShape == CIRCLE){
            shapeImage = new Image(IMG_SHAPES_PATH + "/" + randomShape.name() + IMG_NAME_SUFFIX + "." + IMG_EXTENSION );
        }

        return shapeImage;
    }

    @Override
    public Image getShapeImage() {
        return null;
    }

}
