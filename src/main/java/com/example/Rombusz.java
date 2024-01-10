package com.example;

import java.util.InputMismatchException;

public class Rombusz {
    
    public double calcDistrict(double side){

        if (side <= 0){
            throw new InputMismatchException();
        }

        return 4 * side;
    }

    public double calcArea(double side, double angle){

        if (side <= 0){
            throw new InputMismatchException();
        }

        double rad = angle * Math.PI / 180;

        return Math.pow(side, 2.0) * Math.sin(rad);
    }
}
