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
public class SandwichFilling {
    String sandwichType;
    double calories;

    public SandwichFilling(String sandwichType, double calories) {
        this.sandwichType = sandwichType;
        this.calories = calories;
    }

    public String getSandwichType() {
        return sandwichType;
    }

    public double getCalories() {
        return calories;
    }
    
    
}
