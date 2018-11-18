package com.ljprogramming.app.service;

import com.ljprogramming.app.util.enums.Shape;
import javafx.scene.image.Image;

public interface ShapeService {

    Shape getRandomShape();

    Image getRandomShapeImage();
}
