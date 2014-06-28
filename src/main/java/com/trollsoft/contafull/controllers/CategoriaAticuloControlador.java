/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trollsoft.contafull.controllers;

import com.trollsoft.contafull.entities.CategoriasArticulo;
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

/**
 *
 * @author Alex Osorio
 */
@SessionScoped
@Named
public class CategoriaAticuloControlador implements Serializable {

    @EJB private ICategoriaArticuloServicio servicecategoarticulo;
    private CategoriasArticulo catarticulo;
    private List<CategoriasArticulo> liscatarticulo;

    public CategoriaAticuloControlador() {

    }

    @PostConstruct
    public void init() {
        catarticulo = new CategoriasArticulo();
        listar();

    }

    public void guardarDatos() {
        if (servicecategoarticulo.buscarPorNombre(catarticulo.getNombre()).isEmpty()) {
            catarticulo.setEstado(1);
            servicecategoarticulo.crear(catarticulo);
            Mensaje.agregarInfoMensaje("¡Categoria Articulo " + catarticulo.getNombre() + " guardado exitosamente!", null);
            listar();
        } else {
            servicecategoarticulo.actualizar(catarticulo);
            Mensaje.agregarInfoMensaje("¡Categoria Articulo " + catarticulo.getNombre() + " actualizado exitosamente!", null);
        }

        catarticulo = new CategoriasArticulo();
    } 
    
      public void eliminar() {
        try {
            servicecategoarticulo.eliminar(catarticulo);
            
            listar();
        } catch (Exception e) {
            Mensaje.agregarErrorMensaje("Error AL Eliminar", null);
        }
    }
     
     public void seleccionarr(ActionEvent ae) {
        catarticulo = (CategoriasArticulo) ae.getComponent().getAttributes().get("tipo"); 
    }


private void listar() {
        liscatarticulo = servicecategoarticulo.listar();
        
    }

    public CategoriasArticulo getCatarticulo() {
        return catarticulo;
    }

    public void setCatarticulo(CategoriasArticulo catarticulo) {
        this.catarticulo = catarticulo;
    }

    public List<CategoriasArticulo> getLiscatarticulo() {
        return liscatarticulo;
    }

    public void setLiscatarticulo(List<CategoriasArticulo> liscatarticulo) {
        this.liscatarticulo = liscatarticulo;
    }

}
