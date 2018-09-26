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
public class TestSandwichFilling {
    public static void main(String[] args){
    SandwichFilling sandwich1 = new SandwichFilling("salad", 21);
    SandwichFilling sandwich2 = new SandwichFilling("beef", 32);
    SandwichFilling sandwich3 = new SandwichFilling("jelly", 45);
    System.out.println(sandwich1.getSandwichType() + " and " + sandwich1.getCalories());
        System.out.println(sandwich2.getSandwichType() + " and " + sandwich2.getCalories());
    System.out.println(sandwich3.getSandwichType() + " and " + sandwich3.getCalories());

    }
}
