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
public class Restaurant {
    String name;
    String address;
    String city;

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
    
    UserAccount usrAcc;

    public UserAccount getUsrAcc() {
        return usrAcc;
    }

    /*
    public void setUsrAcc(UserAccount usrAcc) {
        this.usrAcc = usrAcc;
    }
    */
    
    ArrayList<String> menu = new ArrayList<String>();
    ArrayList<Order> orders = new ArrayList<Order>();

    public ArrayList<String> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<String> menu) {
        this.menu = menu;
    }
    
     public void addToMenu(String item){
        this.menu.add(item);
    }
     
      public void RemoveFromMenu(String item){
        this.menu.remove(item);
    }
     
    public void addToOrder(Order order){
        this.orders.add(order);
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
     ArrayList<FinalOrder> ordrAcptd = new ArrayList<FinalOrder>();

    public ArrayList<FinalOrder> getOrdrAcptd() {
        return ordrAcptd;
    }

    public void setOrdrAcptd(ArrayList<FinalOrder> ordrAcptd) {
        this.ordrAcptd = ordrAcptd;
    }
     
     public Restaurant(UserAccount ua)
    {
        this.usrAcc = ua;
    } 
}
