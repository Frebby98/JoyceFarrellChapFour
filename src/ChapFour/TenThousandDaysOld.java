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
public class TenThousandDaysOld {
    LocalDate dateOfBirth;

    public TenThousandDaysOld(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public static void main(String[] args){
        LocalDate birthDay = LocalDate.of(1997, Month.MARCH, 6);
        TenThousandDaysOld daysOld = new TenThousandDaysOld(birthDay);
        LocalDate date = daysOld.dateOfBirth;
                System.out.println(date);

        System.out.println(date.plusDays(10000));
        
    }
}
