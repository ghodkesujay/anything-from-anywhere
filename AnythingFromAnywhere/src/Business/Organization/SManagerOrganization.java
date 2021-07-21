/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.SManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sujayghodke
 */
public class SManagerOrganization extends Organization{
  public SManagerOrganization() {
        super(Organization.Type.SManager.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SManagerRole());
        return roles;
    }   
}
