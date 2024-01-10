package com.example;

public class Rombusz {
    
    public double calcDistrict(double side){

        return 4 * side;
    }

    public double calcArea(double side, double angle){

        double rad = angle * Math.PI / 180;

        return Math.pow(side, 2.0) * Math.sin(rad);
    }
}
