/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author sa22527974
 */
public class Team {
    public int ticketNumber;
    public String teamName;

    public Team(int ticketNumber, String teamName) {
        this.ticketNumber = ticketNumber;
        this.teamName = teamName;
    }
    
    //we dont need getters or setters as we using properties public
}
