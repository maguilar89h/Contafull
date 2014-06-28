/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.services;

import com.trollsoft.contafull.entities.DetallesDocumento;
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
public class DetalleDocumentoServicio extends GenericoServicio<DetallesDocumento> implements IDetallesDocumentosServicio{
 Logger log = Logger.getLogger("Detalles Documentos");
    public DetalleDocumentoServicio() {
        super(DetallesDocumento.class);
    }

 

    @Override
    public List<DetallesDocumento> buscarPorNombre(String nombre) {
        log.log(Level.INFO, "Ejecutando metodo buscar por nombre({0})", this.getClass().getSimpleName());
        TypedQuery<DetallesDocumento> query = this.getEntityManager().createNamedQuery("DetallesDocumento.findByDescripcion", DetallesDocumento.class);
        query.setParameter("nombre", nombre);
        try {
            return query.getResultList();
        } catch (NoResultException e) {
            log.log(Level.WARNING, "Detalle no existe");
            return null;
        }
    }
    
}
