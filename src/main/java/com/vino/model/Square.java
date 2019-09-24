package com.vino.model;

public class Square implements Shape {
    
    String type;
    
    public Square() {
        this.type = "Square";
    }

    @Override
    public int compute(Integer x, Integer y) {

        return (x * x);
    }

    public String getType() {
        return type;
    }

   
    

}