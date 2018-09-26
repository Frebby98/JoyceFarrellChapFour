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
public class TestBread {
     public static void main(String[] args){
         Bread info1 = new Bread("genesis", 4.5);
                  Bread info2 = new Bread("Bonjour", 4);
                           Bread info3 = new Bread("Delight", 2);
                           
                           System.out.println(info1.getBreadType());
                           System.out.println(info1.getCaloriesPerSlice());
                           System.out.println(info1.getMOTTO());
                           
                           System.out.println(info2.getBreadType());
                           System.out.println(info2.getCaloriesPerSlice());
                           System.out.println(info2.getMOTTO());
                           
                           System.out.println(info3.getBreadType());
                           System.out.println(info3.getCaloriesPerSlice());
                           System.out.println(info3.getMOTTO());
                           
                           
     }
}
