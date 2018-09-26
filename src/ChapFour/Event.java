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
public class Event {

    public final static int PRICE_PER_GUEST = 35;
    public final static int CUT_OF_VAL = 50;
    private int eventNumber;
    private int numOfGuest;
    private double price;

    public void setEventNumber(int eventNumber) {
        this.eventNumber = eventNumber;
    }

    public void setNumOfGuest(int numOfGuest) {
        this.numOfGuest = numOfGuest;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Event() {
        
    }

    public Event(int eventNumber, int numOfGuest) {
        this.eventNumber = eventNumber;
        this.numOfGuest = numOfGuest;
    }

    public static int getPRICE_PER_GUEST() {
        return PRICE_PER_GUEST;
    }

    public static int getCUT_OF_VAL() {
        return CUT_OF_VAL;
    }

    public int getEventNumber() {
        return eventNumber;
    }

    public int getNumOfGuest() {
        return numOfGuest;
    }

    public double getPrice() {
        return price;
    }

}
