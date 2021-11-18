/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.FinalOrder;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class Restaurant {
    String name;
    String address;
    String city;

    UserAccount userAccount;

    public UserAccount getUserAccount() {
        return userAccount;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }
    ArrayList<Order> orders = new ArrayList<Order>();
    ArrayList<String> menu = new ArrayList<String>();
    
    ArrayList<FinalOrder> acceptedOrders = new ArrayList<FinalOrder>();

    public ArrayList<FinalOrder> getAcceptedOrders() {
        return acceptedOrders;
    }


    public void setAcceptedOrders(ArrayList<FinalOrder> acceptedOrders) {
        this.acceptedOrders = acceptedOrders;
    }
    
    public void addToMenu(String item)
    {
        this.menu.add(item);
    }
    public void addToOrder(Order order)
    {
        this.orders.add(order);
    }
    public Restaurant(UserAccount ua)
    {
        this.userAccount = ua;
    }
    
    
	
    
}
