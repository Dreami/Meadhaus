/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author maple
 */
public class BeerAction extends org.apache.struts.action.Action {

    private static final String PALE = "pale";
    private static final String DARK = "dark";
    private static final String LIGHT = "light";
    private static final String ERROR = "error";
    
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        BeerActionForm baf = (BeerActionForm) form;
        
        switch (baf.getColor()) {
            case PALE:
                return mapping.findForward(PALE);
            case DARK:
                return mapping.findForward(DARK);
            case LIGHT:
                return mapping.findForward(LIGHT);
        }
        return mapping.findForward(ERROR);
    }
}