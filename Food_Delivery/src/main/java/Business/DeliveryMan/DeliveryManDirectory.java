/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class DeliveryManDirectory {
    ArrayList<DeliveryMan> deliveryDir = new ArrayList<DeliveryMan>();

    public ArrayList<DeliveryMan> getDeliveryDir() {
        return deliveryDir;
    }

    public void setDeliveryDir(ArrayList<DeliveryMan> deliveryDir) {
        this.deliveryDir = deliveryDir;
    }
    
    public void addDeliveryDir(DeliveryMan dm){
        deliveryDir.add(dm);
    }
    
    public void removeDeliveryDir(DeliveryMan dm){
        deliveryDir.remove(dm);
    }
    
    public DeliveryMan getDeliveryMan(UserAccount  useracc)
    {
        for(DeliveryMan dm: deliveryDir)
        {
            if(dm.getName().equals(useracc.getUsername()))
                return dm;
        }
        return null;
    }
}
