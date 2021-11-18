/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.CartModel;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class Customer {
    String customerName;
    UserAccount ua;
    public Customer(UserAccount ua)
    {
        this.ua = ua;
        this.customerName = ua.getUsername();
    }
    
    ArrayList<Order> previousOrders = new ArrayList<Order>();

    ArrayList<CartModel> cart = new ArrayList<CartModel>();

    public ArrayList<CartModel> getCart() {
        return cart;
    }

    public void setCart(ArrayList<CartModel> cart) {
        this.cart = cart;
    }
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }

    public ArrayList<Order> getPreviousOrders() {
        return previousOrders;
    }

    public void setPreviousOrders(ArrayList<Order> previousOrders) {
        this.previousOrders = previousOrders;
    }
    
    public void addToCart(CartModel c)
    {
        this.cart.add(c);
    }
    
    
    
}
