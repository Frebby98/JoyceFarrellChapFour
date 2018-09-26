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
public class FitnessTracker {
    String fitnessActivity;
    double minutes;
    LocalDate date;

    public FitnessTracker() {
        this.minutes = 0;
        this.date = LocalDate.of(2018, Month.JANUARY, 1);
        this.fitnessActivity = "Running";
    }
    public FitnessTracker(String fitnessActivity, 
            double minutes, LocalDate date) {
        this.minutes = minutes;
        this.date = date;
        this.fitnessActivity = fitnessActivity;
    }

    public String getFitnessActivity() {
        return fitnessActivity;
    }

    public double getMinutes() {
        return minutes;
    }

    public LocalDate getDate() {
        return date;
    }
    
}
