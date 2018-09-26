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
public class TestSandwich {
         public static void main(String[] args){
Bread bread1 = new Bread("delight", 5.7);
SandwichFilling filling1 = new SandwichFilling( "best", 6);
Bread bread2 = new Bread("delta", 7);
SandwichFilling filling2 = new SandwichFilling( "hot chop", 8);

    Sandwich sandwich1 = new Sandwich(bread1, filling1);
    Sandwich sandwich2 = new Sandwich(bread2, filling2);

        
        System.out.println(bread1.getBreadType() + 
                " and " + filling1.getSandwichType());
        System.out.println(bread1.getCaloriesPerSlice() + 
                " and " + filling1.getCalories());
        
        System.out.println(bread2.getBreadType() + 
                " and " + filling2.getSandwichType());
        System.out.println(bread2.getCaloriesPerSlice() + 
                " and " + filling2.getCalories());
        
        double totalBreadCal = bread1.getCaloriesPerSlice() +
                bread2.getCaloriesPerSlice();
        double totalSandCal = filling1.getCalories() +
                filling2.getCalories();
        
        System.out.println(totalBreadCal);       
        System.out.println(totalSandCal);

        
        
}
}