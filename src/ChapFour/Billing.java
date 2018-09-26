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
public class Billing {

    public static void main(String[] args) {
        double bookPrice = 60;
        int quantity = 56;
        double coupon = 12.5;
        System.out.println(computeBill(bookPrice));
        System.out.println(computeBill(bookPrice, quantity));

        System.out.println(computeBill(bookPrice, quantity, coupon));

    }

    static double computeBill(double photoBookPrice) {
        int tax = 8;
        double total = photoBookPrice + tax;
        return total;
    }

    static double computeBill(double photoBookPrice, int orderedQuantity) {
        int tax = 8;
        double total = photoBookPrice * orderedQuantity;
        double finalTotal = total + tax;
        return finalTotal;
    }

    static double computeBill(double photoBookPrice, int orderedQuantity,
            double couponVal) {
        int tax = 8;
        double total = photoBookPrice * orderedQuantity - couponVal;
        double finalTotal = total + tax;
        return finalTotal;

    }
}
