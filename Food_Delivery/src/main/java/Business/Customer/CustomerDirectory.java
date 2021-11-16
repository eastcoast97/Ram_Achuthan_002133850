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
    ArrayList<Customer> CstmrList = new ArrayList<Customer>();

    public ArrayList<Customer> getCstmrList() {
        return CstmrList;
    }

    public void setCstmrList(ArrayList<Customer> CstmrList) {
        this.CstmrList = CstmrList;
    }
    
        public Customer getCustomer(UserAccount ua)
    {
        for(Customer c: CstmrList)
        {
            if(ua.getUsername().equals(c.getUsrAcc().getUsername()))
                return c;
        }
        
        return null; 
    }
    
    public void addCustomer(Customer c)
    {
        this.CstmrList.add(c);
    }
    
    public void deleteCustomer(Customer c)
    {
        this.CstmrList.remove(c);
    }
    
}

