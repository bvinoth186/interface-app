package com.vino.bean;

public class AreaResponse {
    
    String type;
    
    String area;

    String message;
    
    
    public AreaResponse(String message) {
        super();
        this.message = message;
    }

    public AreaResponse(String type, String area, String message) {
        super();
        this.type = type;
        this.area = area;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    

}
