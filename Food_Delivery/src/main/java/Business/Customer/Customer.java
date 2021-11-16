/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Restaurant.Cart;
import Business.Restaurant.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class Customer {
    String CstmrName;
    UserAccount UsrAcc;
    
    public Customer(UserAccount ua)
    {
        this.UsrAcc = ua;
        this.CstmrName = ua.getUsername();
    }

    public String getCstmrName() {
        return CstmrName;
    }

    public void setCstmrName(String CstmrName) {
        this.CstmrName = CstmrName;
    }

    public UserAccount getUsrAcc() {
        return UsrAcc;
    }

    public void setUsrAcc(UserAccount UsrAcc) {
        this.UsrAcc = UsrAcc;
    }
    

    ArrayList<Cart> cart = new ArrayList<Cart>();
    ArrayList<Order> previousOrders = new ArrayList<Order>();

    public ArrayList<Cart> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Cart> cart) {
        this.cart = cart;
    }
    
    public void addToCart(Cart cart)
    {
        this.cart.add(cart);
    }

    public ArrayList<Order> getPreviousOrders() {
        return previousOrders;
    }

    public void setPreviousOrders(ArrayList<Order> previousOrders) {
        this.previousOrders = previousOrders;
    }
    
}
