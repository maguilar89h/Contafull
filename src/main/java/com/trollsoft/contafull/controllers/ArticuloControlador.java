/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.controllers;

import com.trollsoft.contafull.entities.Articulos;
import com.trollsoft.contafull.entities.CategoriasArticulo;
import com.trollsoft.contafull.services.IArticulosServicio;
import com.trollsoft.contafull.services.ICategoriaArticuloServicio;
import com.trollsoft.contafull.utilities.Mensaje;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import org.primefaces.model.DualListModel;

/**
 *
 * @author Alex Osorio
 */
@SessionScoped
@Named
public class ArticuloControlador implements Serializable{
    
    @EJB
    private IArticulosServicio servicearticulo;
    private Articulos articulos;
    private List<Articulos> lisarticulos;
    private DualListModel<Articulos> listaArticulos; 
    
    @EJB private ICategoriaArticuloServicio servicecategoarticulo;
   
    private List<CategoriasArticulo> liscatarticulo; 

    public ArticuloControlador() {
    }
    
    @PostConstruct
    public void init(){
    articulos = new Articulos();
    listar();
    }
    
      public void guardarDatos(){
        if(servicearticulo.buscarPorNombre(articulos.getNombre()).isEmpty()){
            articulos.setEstado(1);
            servicearticulo.crear(articulos);
            Mensaje.agregarInfoMensaje("¡Articulo " + articulos.getNombre() + " guardado exitosamente!", null);
        }else{
            servicearticulo.actualizar(articulos);
            Mensaje.agregarInfoMensaje("¡Articulo " + articulos.getNombre() + " actualizado exitosamente!", null);
        }        
    }
      
       private void listar() {
           lisarticulos =  servicearticulo.listar();
           
    }
    
       public void eliminar() {
        try {
            servicearticulo.eliminar(articulos);
            
            listar();
        } catch (Exception e) {
            Mensaje.agregarErrorMensaje("Error AL Eliminar", null);
        }
    }
     
     public void seleccionarr(ActionEvent ae) {
        articulos = (Articulos) ae.getComponent().getAttributes().get("tipo"); 
    }
    
    
    

    public Articulos getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulos articulos) {
        this.articulos = articulos;
    }

    public List<Articulos> getLisarticulos() {
        return lisarticulos;
    }

    public void setLisarticulos(List<Articulos> lisarticulos) {
        this.lisarticulos = lisarticulos;
    }


    public List<CategoriasArticulo> getLiscatarticulo() {
        return liscatarticulo;
    }

    public void setLiscatarticulo(List<CategoriasArticulo> liscatarticulo) {
        this.liscatarticulo = liscatarticulo;
    }

    public DualListModel<Articulos> getListaArticulos() {
        return listaArticulos;
    }

    public void setListaArticulos(DualListModel<Articulos> listaArticulos) {
        this.listaArticulos = listaArticulos;
    }
    
    
    
    
}
