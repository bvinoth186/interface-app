package com.vino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vino.bean.AreaResponse;
import com.vino.factory.ShapeFactory;
import com.vino.model.Rectangle;
import com.vino.model.Shape;
import com.vino.model.Square;

@RestController
public class AreaController {

    @Autowired
    ShapeFactory factory;

    @GetMapping(value = "/area", produces = "application/json")
    @CrossOrigin(origins = "*")
    public ResponseEntity<AreaResponse> getArea(@RequestParam(name = "type") String type,
            @RequestParam(name = "x") Integer x, @RequestParam(required = false, name = "y") Integer y) {

        Shape shape = validate(type, x, y);
        AreaResponse areaResponse = null;
        if (shape != null) {
            int area = shape.compute(x, y);
            String shapeType = shape.getType();

            areaResponse = new AreaResponse(shapeType, area + "", "Success");
        } else {
            areaResponse = new AreaResponse("Invalid inputs");
        }
        HttpStatus status = HttpStatus.OK;

        return new ResponseEntity<>(areaResponse, status);

    }

    private Shape validate(String type, Integer x, Integer y) {
        Shape shape = factory.getShape(type);
        if (shape == null) {
            return null;
        } else if (shape instanceof Rectangle &&  (x == null || y == null)) {
            return null;
        } else if (shape instanceof Square &&  x == null) {
            return null;
        } else {
            return shape;
        }
    }
}
