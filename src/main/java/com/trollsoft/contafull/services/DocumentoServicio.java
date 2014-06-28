/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.services;

import com.trollsoft.contafull.entities.Documentos;
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
public class DocumentoServicio extends GenericoServicio<Documentos> implements IDocumentosServicio{
Logger log = Logger.getLogger("Documentos");
    public DocumentoServicio() {
        super(Documentos.class);
    }

    

    @Override
    public List<Documentos> buscarPorCodigo(String codigo) {
       log.log(Level.INFO, "Ejecutando metodo buscar por codigo({0})", this.getClass().getSimpleName());
        TypedQuery<Documentos> query = this.getEntityManager().createNamedQuery("Documentos.findByCodigo", Documentos.class);
        query.setParameter("codigo", codigo);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            log.log(Level.WARNING, "Documento");
            return null;
        }
    
    }

    
    
}
