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
public class TestMonthHandling {
    private LocalDate firstDate;
    private LocalDate secondDate;

    public TestMonthHandling(LocalDate firstDate, LocalDate secondDate) {
        this.firstDate = firstDate;
        this.secondDate = secondDate;
    }   
    
    public static void main(String[] args){
       
        LocalDate date1 = LocalDate.of(2018, Month.JANUARY, 31);
                LocalDate date2 = LocalDate.of(2018, Month.DECEMBER, 31);

        TestMonthHandling test = new TestMonthHandling(date1, date2);
        
        LocalDate addDate1 = test.firstDate;
        System.out.println(addDate1);
        System.out.println(addDate1.plusMonths(1));
        System.out.println(addDate1.plusMonths(2));
        System.out.println(addDate1.plusMonths(3));
        
        LocalDate addDate2 = test.secondDate;
        System.out.println(addDate2);
        System.out.println(addDate2.plusMonths(1));
        System.out.println(addDate2.plusMonths(2));
        System.out.println(addDate2.plusMonths(3));
      
    }
}
