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
public class BloodData {
    private char bloodType;
    private char rhFactor;

    public BloodData(char bloodType, char rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public BloodData() {
        bloodType = 'O';
        rhFactor = '+';
    }

    public char getBloodType() {
        return bloodType;
    }

    public void setBloodType(char bloodType) {
        this.bloodType = bloodType;
    }

    public char getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(char rhFactor) {
        this.rhFactor = rhFactor;
    }
    

    
}
