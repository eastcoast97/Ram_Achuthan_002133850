/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.FinalOrder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class DeliveryMan {
    String name;
    String status;
    UserAccount useracc;

    
     ArrayList<FinalOrder> orderDelivered = new ArrayList<FinalOrder>();

    public ArrayList<FinalOrder> getOrderDelivered() {
        return orderDelivered;
    }

    public void setOrderDelivered(ArrayList<FinalOrder> orderDelivered) {
        this.orderDelivered = orderDelivered;
    }
     
     public void addOrderDelivered(FinalOrder f){
         orderDelivered.add(f);
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

    public UserAccount getUseracc() {
        return useracc;
    }

    public void setUseracc(UserAccount useracc) {
        this.useracc = useracc;
    }
    
    public void setUa(UserAccount useraccc) {
        this.useracc = useraccc;
    }
    
     public DeliveryMan(UserAccount ua)
    {
        this.useracc = ua;
        this.name = ua.getUsername();
    }
     
}
