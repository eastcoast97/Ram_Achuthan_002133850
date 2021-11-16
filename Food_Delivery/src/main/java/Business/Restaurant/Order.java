/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author ram.a
 */
public class Order {
    String id;
    String restaurant;
    String itm;
    String sender;
    String receiver;
    String status;
    String mssg;
    Date date;
    LocalDateTime entryDT;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getItm() {
        return itm;
    }

    public void setItm(String itm) {
        this.itm = itm;
    }

    public String getMssg() {
        return mssg;
    }

    public void setMssg(String mssg) {
        this.mssg = mssg;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDateTime getEntryDT() {
        return entryDT;
    }

    public void setEntryDT(LocalDateTime entryDT) {
        this.entryDT = entryDT;
    }

    
}
