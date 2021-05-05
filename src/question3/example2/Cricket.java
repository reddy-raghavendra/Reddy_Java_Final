/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3.example2;

/**
 *
 * @author Raghavendra Reddy
 */
public class Cricket extends Sports {

    public Cricket() {
        super();
        System.out.println("Cricket class constructor is invoked");
    }

    @Override
    public void totalMembersPlayed() {
        System.out.println("Cricket is played with total of 11 players in each"
                + "team");
    }

}
