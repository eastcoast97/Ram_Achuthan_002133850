/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ram.a
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccntLst;

    public UserAccountDirectory() {
        userAccntLst = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccntLst;
    }
    
    public UserAccount authenticateUser(String uname, String pass){
        for (UserAccount ua : userAccntLst)
            if (ua.getUsername().equals(uname) && ua.getPassword().equals(pass)){
                return ua;
            }
        return null;
    }
    
    public boolean verifyUserLogin(String uname,String pass)
    {
        for (UserAccount ua : userAccntLst)
            if (ua.getUsername().equals(uname) && ua.getPassword().equals(pass)){
                return true;
            }
        return false;
    }
    
    public UserAccount createUserAccount(String uname, String pass, Employee emp, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(uname);
        userAccount.setPassword(pass);
        userAccount.setEmployee(emp);
        userAccount.setRole(role);
        
        userAccntLst.add(userAccount);
        return userAccount;
    }
        public UserAccount getUserAccount(String uname) {
        for(UserAccount useracc: userAccntLst)
        {
            if(useracc.getUsername().equals(uname))
            {
                return useracc;
            }
        }
        return null;
    }
    public boolean checkIfUsernameIsUnique(String uname){
        for (UserAccount useracc : userAccntLst){
            if (useracc.getUsername().equals(uname))
                return false;
        }
        return true;
    }
    

}
