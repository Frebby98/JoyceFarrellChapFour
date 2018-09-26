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
public class FiveDice {
     public static void main(String[] args){
        int comThrow;
        int playThrow;
        
        System.out.println("Computer " + getRandom());
                System.out.println("Player " + getRandom());
                System.out.println("Computer " + getRandom());
                System.out.println("Player " + getRandom());

    
}
     public static int getRandom(){
         int HIGHEST_DIE_VALUE = 5;
        int LOWEST_DIE_VALUE = 1;
        int random = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
LOWEST_DIE_VALUE);
        return random;
     }
}
