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
public class Patient {
    private int idNum;
    private int age;
     private char bloodType;
    private char rhFactor;
    private BloodData data;

    public Patient() {
        BloodData data = new BloodData('O', '+');
        this.idNum = 0;
        this.age = 0;
        this.data = data;
    }

    public Patient(int idNum, int age, BloodData data) {
        this.idNum = idNum;
        this.age = age;
        this.data = data;
        
    }

    public int getIdNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    public BloodData getData() {
        return data;
    }
}
