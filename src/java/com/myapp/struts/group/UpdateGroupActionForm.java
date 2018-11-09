/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts.group;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author edson
 */
public class UpdateGroupActionForm extends org.apache.struts.action.ActionForm {
    
    private String usersOutside;
    private String usersInside;


    /**
     * @return
     */
    public String getUsersOutside() {
        return usersOutside;
    }

    /**
     * @param string
     */
    public void setUsersOutside(String string) {
        usersOutside = string;
    }

    public String getUsersInside() {
        return usersInside;
    }

    public void setUsersInside(String usersInside) {
        this.usersInside = usersInside;
    }

    


    /**
     *
     */
    public UpdateGroupActionForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (getUsersOutside() == null || getUsersOutside().length() < 1) {
            errors.add("usersOutside", new ActionMessage("error.usersOutside.required"));
            errors.add("usersInside", new ActionMessage("error.usersInside.required"));
            // TODO: add 'error.usersOutside.required' key to your resources
        }
        return errors;
    }
}
