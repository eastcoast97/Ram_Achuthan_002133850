/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author ram.a
 */
public class FinalOrder {
    String orderId;
    String date;
    String restaurant;
    String itm;
    String dlvryMan;
    String customer;
    String status;
    String review;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getItm() {
        return itm;
    }

    public void setItm(String itm) {
        this.itm = itm;
    }

    public String getDlvryMan() {
        return dlvryMan;
    }

    public void setDlvryMan(String dlvryMan) {
        this.dlvryMan = dlvryMan;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    
}

