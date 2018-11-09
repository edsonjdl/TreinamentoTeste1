/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.group;

import Utils.DAO;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Group;
import model.User;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author edson
 */
public class AddRemoveUserAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
                System.out.println("AddRemoveUserAction - servlet");
        AddRemoveUserForm arf = (AddRemoveUserForm) form; 
        Group group = new Group();
        DAO.openSession();
        
        group = DAO.findGroupById(arf.getGroupId());
        request.setAttribute("group", group);
               
        HashSet<User> usersInside = new HashSet<User>();
        //usersInside = group.getUsers();
        
        for(Object o : group.getUsers()){
            usersInside.add((User)o);
        }
        
   

        DAO.getSession().flush();
        //DAO.getSession().clear();
        
        ArrayList<User> usersList = new ArrayList<User>();
        ArrayList<User> usersOutside = new ArrayList<User>();
        DAO.listUsers(usersList);   
        
        
        for(User u : usersList){
            
            String login = u.getLogin();
            boolean check = true;
            
            for(User ui: usersInside){
                
                if(ui.getLogin().equals(login)){
                    check = false;
                }
            }
            
            if(check){
                usersOutside.add(u);
            }
            
        }
        
        request.setAttribute("usersOut", usersOutside);        
        request.setAttribute("usersIn", usersInside);

        
        //DAO.closeSession();
        
        
        
        return mapping.findForward(SUCCESS);
    }
}
