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
public class TestCircle {
    public static void main(String[] args){
    Circle circle1 = new Circle();
    Circle circle2 = new Circle();
    Circle circle3 = new Circle();
    circle1.setRadius(6);
    System.out.println(circle1.getRadius());
    
    circle2.setRadius(12);
    System.out.println(circle2.getRadius());
    
    System.out.println(circle3.getRadius());
    }
}
