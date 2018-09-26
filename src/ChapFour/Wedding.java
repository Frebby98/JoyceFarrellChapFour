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
public class Wedding {
    private LocalDate wedDate;
    private Couple names;
    private String location;

    public Wedding(LocalDate wedDate, Couple names, String location) {
        this.wedDate = wedDate;
        this.names = names;
        this.location = location;
    }
}
