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
public class FormLetterWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName = "Frebanga";
        String lastName = "Udoh";
        displaySalutation(lastName);
        displaySalutation(lastName, firstName);
        
    }
    static void displaySalutation(String lastName){
        System.out.println("Dear Mr or Ms. " + lastName);
    }
    static void displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName +
                "\n" +"Thank you for your recent order.");
    }
    
}
