/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapFour;

/**
 *
 * @author Frebby
 */
public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        this.diameter = radius * 2;
        this.area = Math.PI* diameter;
    }

    public void setRadius(double radius) {
        this.diameter = radius * 2;  
        this.area = Math.PI * diameter;
    }

    public double getRadius() {
        return radius;
    }
    
 
}
