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
import java.lang.Math;
public class MathTest {
    public static void main(String[] args){
        int sqrt = 16;
        int sinAndCos = 300;
        double floorCeilRound = 22.8;
        int random = 20;
        
        sqrtRoot(sqrt);
        sineAndCosine(sinAndCos);
        floorCeilingRound(floorCeilRound);
        randomNumber(random);
        
        
        
        
    }
    static void sqrtRoot(double num){
        System.out.println("Square root = " + Math.sqrt(num));
    } 
    
    static void sineAndCosine(double num){
        System.out.println("Sine = " + Math.sin(num));
        System.out.println("Cosine = " + Math.cos(num));
    } 
    static void floorCeilingRound(double num){
        System.out.println("floor = " + Math.floor(num));
        System.out.println("Ceiling = " + Math.ceil(num));
        System.out.println("Round = " + Math.round(num));
    }
    static void largeAndSmall(int num){
       
    } static int randomNumber(int LIMIT){
       int random = ((int) (Math.random() * 100) % LIMIT + 1);
       System.out.println(random);
       return random;
    } 
    
}
