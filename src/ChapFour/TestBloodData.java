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
public class TestBloodData {
    public static void main(String[] args){
        BloodData data = new BloodData();
                BloodData data2 = new BloodData();

        data.setBloodType('O');
        System.out.println(data.getBloodType());
        data.setRhFactor('+');
        System.out.println(data.getRhFactor());
        
        
        
        
    }
}
