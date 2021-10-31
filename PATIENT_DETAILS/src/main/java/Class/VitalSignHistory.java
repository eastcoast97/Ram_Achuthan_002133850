/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> history;
    
    public VitalSignHistory() {
        history = new ArrayList<>();
    }

    public ArrayList<VitalSign> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<VitalSign> history) {
        this.history = history;
    }
    public VitalSign createAndAddVitalSign() {
        VitalSign vitalSign = new VitalSign();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSign vitalSign) {
        history.remove(vitalSign);
    }
    
}
