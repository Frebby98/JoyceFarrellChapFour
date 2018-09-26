/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapFour;

import java.time.LocalDate;

/**
 *
 * @author Frebby
 */
public class TestWedding {
    public static void main(String[] args){
    LocalDate date = LocalDate.now();
    
    Person hubby = new Person("Not", "telling");
    Person wife = new Person("Gerra", "rahia");
    
    Couple couple = new Couple(hubby, wife);
    
    
    String location = "No.6 blah blah blah";
    
    Wedding wed = new Wedding(date, couple, location);
}
}