/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.services;

import com.trollsoft.contafull.entities.DetallesDocumento;
import com.trollsoft.contafull.entities.Documentos;
import java.util.List;

/**
 *
 * @author Alex Osorio
 */
public interface IDetallesDocumentosServicio extends IGenericoServicio<DetallesDocumento>{
   public List<DetallesDocumento> buscarPorNombre(String nombre);
    
}
