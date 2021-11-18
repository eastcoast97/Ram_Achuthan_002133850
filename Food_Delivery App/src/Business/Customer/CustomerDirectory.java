/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList = new ArrayList<Customer>();

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer getCustoo(UserAccount ua)
    {
        for(Customer c: customerList)
        {
            if(ua.getUsername().equals(c.getUa().getUsername()))
                return c;
        }
        
        return null; 
    }
    
    public void addCusto(Customer c)
    {
        this.customerList.add(c);
    }
}
