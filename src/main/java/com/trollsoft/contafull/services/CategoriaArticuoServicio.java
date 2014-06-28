/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.services;

import com.trollsoft.contafull.entities.CategoriasArticulo;
import java.util.logging.Logger;
import java.util.List;
import java.util.logging.Level;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Alex Osorio
 */
@Stateless
public class CategoriaArticuoServicio extends GenericoServicio<CategoriasArticulo> implements ICategoriaArticuloServicio{
Logger log = Logger.getLogger("CategoriaArticulos");
    public CategoriaArticuoServicio() {
        super(CategoriasArticulo.class);
    }

    @Override
    public List<CategoriasArticulo> buscarPorNombre(String nombre) {
       log.log(Level.INFO, "Ejecutando metodo buscar por nombre({0})", this.getClass().getSimpleName());
        TypedQuery<CategoriasArticulo> query = this.getEntityManager().createNamedQuery("CategoriasArticulo.findByNombre", CategoriasArticulo.class);
        query.setParameter("nombre", nombre);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            log.log(Level.WARNING, "CategoriaArticulo no existe");
            return null;
        }
    
    
    }

   
}
