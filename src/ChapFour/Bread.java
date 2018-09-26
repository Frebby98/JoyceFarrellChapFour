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
public class Bread {
    String breadType;
    double caloriesPerSlice;
    final static String MOTTO = "The stuff of life";

    public Bread(String breadType, double caloriesPerSlice) {
        this.breadType = breadType;
        this.caloriesPerSlice = caloriesPerSlice;
    }

    public String getBreadType() {
        return breadType;
    }

    public double getCaloriesPerSlice() {
        return caloriesPerSlice;
    }

    public static String getMOTTO() {
        return MOTTO;
    }
    
}
