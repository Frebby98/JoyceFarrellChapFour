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
public class Person {
    private String firstName;
    private String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
