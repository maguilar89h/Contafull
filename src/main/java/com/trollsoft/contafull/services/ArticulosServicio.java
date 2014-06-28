/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.services;

import com.trollsoft.contafull.entities.Articulos;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Alex Osorio
 */
@Stateless
public class ArticulosServicio extends GenericoServicio<Articulos> implements IArticulosServicio{

    Logger log = Logger.getLogger("Articulos");
    public ArticulosServicio() {
        super(Articulos.class);
    }

  

    @Override
    public List<Articulos> buscarPorNombre(String nombre) {
       log.log(Level.INFO, "Ejecutando metodo buscar por nombre({0})", this.getClass().getSimpleName());
        TypedQuery<Articulos> query = this.getEntityManager().createNamedQuery("Articulos.findByNombre", Articulos.class);
        query.setParameter("nombre", nombre);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            log.log(Level.WARNING, "Articulo no existe");
            return null;
        }
    
    
    }
    
}
