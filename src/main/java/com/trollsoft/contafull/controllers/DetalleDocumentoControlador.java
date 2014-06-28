/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trollsoft.contafull.controllers;

import com.trollsoft.contafull.entities.Articulos;
import com.trollsoft.contafull.entities.DetallesDocumento;
import com.trollsoft.contafull.services.IDetallesDocumentosServicio;
import java.io.Serializable;
import java.util.ArrayList;
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
public class DetalleDocumentoControlador implements Serializable {

    @EJB
    private IDetallesDocumentosServicio detalleDocumentoServicio;
    private DetallesDocumento detalleDocumento;
    private List<DetallesDocumento> lisdetalledoc;

    public DetalleDocumentoControlador() {
    }

    @PostConstruct
    public void init() {
        detalleDocumento = new DetallesDocumento();

    }

    public void guardarDatos() {
        if (detalleDocumentoServicio.buscarPorNombre(detalleDocumento.getDescripcion()).isEmpty()) {
            detalleDocumento.setEstado(1);
            detalleDocumentoServicio.crear(detalleDocumento);
            //Mensaje.agregarInfoMensaje("¡Articulo " + detalleDocumento.getNombre() + " guardado exitosamente!", null);
        } else {
            detalleDocumentoServicio.actualizar(detalleDocumento);
            // Mensaje.agregarInfoMensaje("¡Articulo " + articulos.getNombre() + " actualizado exitosamente!", null);
        }
    }

    public void listar() {
        lisdetalledoc = detalleDocumentoServicio.listar();
    }

    public DetallesDocumento getDetalleDocumento() {
        return detalleDocumento;
    }

    public void setDetalleDocumento(DetallesDocumento detalleDocumento) {
        this.detalleDocumento = detalleDocumento;
    }

    public List<DetallesDocumento> getLisdetalledoc() {
        return lisdetalledoc;
    }

    public void setLisdetalledoc(List<DetallesDocumento> lisdetalledoc) {
        this.lisdetalledoc = lisdetalledoc;
    }

    public void crearLineaDetalle(Articulos articulo) {
        if (articulo != null) {
            if (lisdetalledoc == null) {
                lisdetalledoc = new ArrayList<>();
            }
            DetallesDocumento detalle = new DetallesDocumento();
            detalle.setArticulo(articulo);
            detalle.setCantidad(1);
            lisdetalledoc.add(detalleDocumento);
        }
    }
    
     public void crearLineaDetalle(List<Articulos> articulos) {
        if (articulos != null) {
            if (lisdetalledoc == null) {
                lisdetalledoc = new ArrayList<>();
            }
            for(Articulos articulo : articulos){
                DetallesDocumento detalle = new DetallesDocumento();
                detalle.setArticulo(articulo);
                detalle.setCantidad(1);
                lisdetalledoc.add(detalleDocumento);
            }
        }
    }
     
    public void adisionarArticulo(Articulos articulo, Integer cantidad){
        if (lisdetalledoc == null) {
            lisdetalledoc = new ArrayList<>();
             crearLineaDetalle(articulo);
        }else{
            Integer i = indiceArticulo(articulo);
            if(i>=0){
                DetallesDocumento detalle = lisdetalledoc.get(i);
                Articulos art = detalle.getArticulo();
                if(art!=null){
                    if(art.getId() == articulo.getId()){
                        detalle.setCantidad(detalle.getCantidad()+cantidad);
                        lisdetalledoc.add(i, detalle);
                    }
                }
            }else{
                crearLineaDetalle(articulo);
            }
        }
    }
    
    private Integer indiceArticulo(Articulos articulo){
        if(lisdetalledoc!=null){
            for (int i = 0; i < lisdetalledoc.size(); i++) {
                DetallesDocumento detalle = lisdetalledoc.get(i);
                if(detalle.getArticulo().getId().equals(articulo.getId())){
                    return i;
                }
            }
        }
        return -1;
    }
}
