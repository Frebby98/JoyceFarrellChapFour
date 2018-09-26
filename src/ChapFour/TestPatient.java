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
public class TestPatient {

    public static void main(String[] args) {
        BloodData data2 = new BloodData('A', '-');
        BloodData data = new BloodData();

        Patient patient = new Patient();
        Patient patient2 = new Patient(2, 23, data);
        System.out.println(patient.getAge());
        System.out.println("Blood data type " + data.getBloodType() + " and "
                + "Rh Factor " + data.getRhFactor());
        System.out.println(patient.getIdNum());

        System.out.println(patient2.getAge());
        System.out.println("Blood data type " + data2.getBloodType() + " and "
                + "Rh Factor " + data2.getRhFactor());

        System.out.println(patient2.getIdNum());

    }
}
