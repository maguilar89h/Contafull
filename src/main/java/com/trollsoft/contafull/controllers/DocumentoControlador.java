/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trollsoft.contafull.controllers;

import com.trollsoft.contafull.entities.Articulos;
import com.trollsoft.contafull.entities.Documentos;
import com.trollsoft.contafull.services.IDocumentosServicio;
import com.trollsoft.contafull.utilities.Mensaje;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Alex Osorio
 */
@Named
@SessionScoped
public class DocumentoControlador implements Serializable {

    @EJB
    private IDocumentosServicio documentosServicio;
    private Documentos documentos;
    private List<Documentos> lisdocumet;
    
    private Articulos articulo;

    public DocumentoControlador() {
    }

    @PostConstruct
    public void init() {
        documentos = new Documentos();
        listar();
    }

    public void guardarDatos() {
        if (documentosServicio.buscarPorCodigo(documentos.getCodigo()).isEmpty()) {
            documentos.setEstado(1);
            documentosServicio.crear(documentos);
            Mensaje.agregarInfoMensaje("¡Articulo " + documentos.getCodigo() + " guardado exitosamente!", null);
        } else {
            documentosServicio.actualizar(documentos);
            Mensaje.agregarInfoMensaje("¡Articulo " + documentos.getCodigo() + " actualizado exitosamente!", null);
        }
    }

    public void listar() {
        lisdocumet = documentosServicio.listar();

    }
    
    public void eliminar(){
    try {
            documentosServicio.eliminar(documentos);
            
            listar();
        } catch (Exception e) {
            Mensaje.agregarErrorMensaje("Error AL Eliminar", null);
        }
    
    }
    
    public void creardetalle(){
    Mensaje.agregarInfoMensaje("¡Mañe" , null);
   
    
    }

    public Documentos getDocumentos() {
        return documentos;
    }

    public void setDocumentos(Documentos documentos) {
        this.documentos = documentos;
    }

    public List<Documentos> getLisdocumet() {
        return lisdocumet;
    }

    public void setLisdocumet(List<Documentos> lisdocumet) {
        this.lisdocumet = lisdocumet;
    }

}
