package com.vino.factory;

import org.springframework.stereotype.Component;

import com.vino.model.Rectangle;
import com.vino.model.Shape;
import com.vino.model.Square;

@Component
public class ShapeFactory {

    public Shape getShape(String type){  
        
        if ("s".equalsIgnoreCase(type)) {
            return new Square();
        } if ("r".equalsIgnoreCase(type)) {
            return new Rectangle();
        } else {
            return null;
        }
    }

}
