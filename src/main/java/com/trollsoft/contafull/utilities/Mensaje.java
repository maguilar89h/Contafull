/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.utilities;

import javax.faces.application.FacesMessage;
import static javax.faces.application.FacesMessage.*;
import javax.faces.context.FacesContext;

/**
 *
 * @author Desarrollo
 */
public class Mensaje {
    public static void agregarErrorMensaje(String mensaje, String detalle){
        agregarMensaje(SEVERITY_ERROR, mensaje, detalle);
    }
    
    public static void agregarInfoMensaje(String mensaje, String detalle){
        agregarMensaje(SEVERITY_INFO, mensaje, detalle);
    }
    
    public static void agregarWarnMensaje(String mensaje, String detalle){
        agregarMensaje(SEVERITY_WARN, mensaje, detalle);
    }
    
    private static void agregarMensaje(Severity severidad, String mensaje, String detalle){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severidad, mensaje, detalle));
    }
}
