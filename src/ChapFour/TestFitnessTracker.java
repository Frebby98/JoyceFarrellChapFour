/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapFour;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Frebby
 */
public class TestFitnessTracker {
    public static void main(String[] args){
        String fitnessName = "Jugging";
                int minutes = 56;
                LocalDate date = LocalDate.of(2066, Month.MARCH, 7);
        FitnessTracker fitness = new FitnessTracker(fitnessName, minutes, date);
        FitnessTracker fitness2 = new FitnessTracker();

        System.out.println(fitness.getDate());
        System.out.println(fitness.getFitnessActivity());
                System.out.println(fitness.getMinutes());
                System.out.println(fitness2.getDate());
                        System.out.println(fitness2.getFitnessActivity());
                System.out.println(fitness2.getMinutes());


    }
}
