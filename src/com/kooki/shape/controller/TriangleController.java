package com.kooki.shape.controller;

import com.kooki.shape.model.vo.Shape;

public class TriangleController {

    Shape sp = new Shape();

    public double calcArea(double height, double width) {
        sp.setHeight(height);
        sp.setWidth(width);

        return width*(height/2);
    }

    public void paintColor(String color){
        sp.setColor(color);
    }

    public String print(){
        return "삼각형 : "+sp.information();
    }



}
