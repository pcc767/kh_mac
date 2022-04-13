package com.kooki.shape.controller;

import com.kooki.shape.model.vo.Shape;

public class SquareController {

    Shape sp = new Shape();

    public double calcPerimeter(double height, double width){
        sp.setHeight(height);
        sp.setWidth(width);

        return (height*2)+(width*2);
    }

    public double calcArea(double height, double width){
        sp.setHeight(height);
        sp.setWidth(width);

        return height+width;
    }

    public void paintColor(String color){
        sp.setColor(color);
    }

    public String print(){
        return "사각형 : "+sp.information();
    }




}
