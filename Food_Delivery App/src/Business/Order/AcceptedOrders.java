/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class AcceptedOrders {
    ArrayList<FinalOrder> acceptedOrders = new ArrayList<FinalOrder>();
 
    public ArrayList<FinalOrder> getAcceptedOrders() {
        return acceptedOrders;
    }

    public void setAcceptedOrders(ArrayList<FinalOrder> acceptedOrders) {
        this.acceptedOrders = acceptedOrders;
    }
    
}
