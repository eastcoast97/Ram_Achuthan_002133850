/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.FinalOrder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> restaurantList = new ArrayList<Restaurant>();

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    
    public Restaurant getResto(UserAccount ua)
    {
        for(Restaurant r: restaurantList)
        {
            if(ua.getUsername().equals(r.getUserAccount().getUsername()))
                return r;
        }
        
        return null; 
    }

    public void addResto(Restaurant resto) {
        restaurantList.add(resto);
    }
    
    int orderIdGeneration = 100;
    public int generateOrderId()
    {
        orderIdGeneration++;
        return orderIdGeneration;
    }
    
    public FinalOrder getOrder(String id)
    {
        for(Restaurant r: restaurantList)
        {
            ArrayList<FinalOrder> acceptedOrders = r.getAcceptedOrders();
        for(FinalOrder f: acceptedOrders)
        {
            if(id.equals(f.getOrderId()))
                return f;
        }
        }
        return null;
    }
    
    

}
