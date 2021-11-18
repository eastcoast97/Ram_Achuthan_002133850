/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Order.FinalOrder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class DeliveryMan {
    String name;
    String status;
    UserAccount ua;

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    public DeliveryMan(UserAccount ua)
    {
        this.ua = ua;
        this.name = ua.getUsername();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<FinalOrder> getDeliveredOrders() {
        return deliveredOrders;
    }

    public void setDeliveredOrders(ArrayList<FinalOrder> deliveredOrders) {
        this.deliveredOrders = deliveredOrders;
    }
    ArrayList<FinalOrder> deliveredOrders = new ArrayList<FinalOrder>();
    public void addDeliveredOrder(FinalOrder f)
    {
        deliveredOrders.add(f);
    }
}
