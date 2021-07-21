/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SFinancialRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class SFinancialOrganization extends Organization{
  public SFinancialOrganization() {
        super(Organization.Type.SFinancial.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SFinancialRole());
        return roles;
    }   
}
