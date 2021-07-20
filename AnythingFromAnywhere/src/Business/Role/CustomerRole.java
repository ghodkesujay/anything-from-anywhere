/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.AFASystem;
import Business.UserAccount.UserAccount;
import UserInterface.Customer.CustomerWorkAreaJPanel;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author sujayghodke
 */
public class CustomerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, AFASystem system) {
        return new CustomerWorkAreaJPanel(userProcessContainer, account,system); //To change body of generated methods, choose Tools | Templates.
    }
}
