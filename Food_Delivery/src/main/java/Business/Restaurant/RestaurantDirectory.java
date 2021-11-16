/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> rstrntList = new ArrayList<Restaurant>();

    public ArrayList<Restaurant> getRstrntList() {
        return rstrntList;
    }

    public void setRstrntList(ArrayList<Restaurant> rstrntList) {
        this.rstrntList = rstrntList;
    }
    
    public Restaurant getRestaurant(UserAccount ua)
    {
        for(Restaurant r: rstrntList)
        {
            if(ua.getUsername().equals(r.getUsrAcc().getUsername()))
                return r;
        }
        return null; 
    }

    public void addRestaurant(Restaurant restaurant) {
        rstrntList.add(restaurant);
    }
    
    public void removeRestaurant(Restaurant restaurant) {
        rstrntList.remove(restaurant);
    }
    
    int orderID = 0;
    public int generateOrderId()
    {
        orderID++;
        
        return orderID;
    }
    
    public FinalOrder getFinalOrder(String id)
    {
        for(Restaurant r: rstrntList)
        {
            ArrayList<FinalOrder> ordersAccepted = r.getOrdrAcptd();
                for(FinalOrder fo: ordersAccepted)
                {
                    if(id.equals(fo.getOrderId()))
                        return fo;
                }
        }
        return null;
    }
}
