package com.vino.model;

public class Rectangle implements Shape {

    
    String type;
    
    public Rectangle() {
        this.type = "Rectangle";
    }

    @Override
    public int compute(Integer x, Integer y) {

        return (x * y);
    }

    public String getType() {
        return type;
    }

   
    

}
