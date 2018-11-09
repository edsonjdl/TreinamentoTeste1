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
public class AddRemoveUserForm extends org.apache.struts.action.ActionForm {
    
    private String groupId;


    /**
     * @return
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param string
     */
    public void setGroupId(String string) {
        groupId = string;
    }


    /**
     *
     */
    public AddRemoveUserForm() {
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
        if (getGroupId() == null || getGroupId().length() < 1) {
            errors.add("groupId", new ActionMessage("error.groupId.required"));
            // TODO: add 'error.groupId.required' key to your resources
        }
        return errors;
    }
}
