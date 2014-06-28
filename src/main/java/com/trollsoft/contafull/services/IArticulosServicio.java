/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.services;

import com.trollsoft.contafull.entities.Articulos;
import java.util.List;

/**
 *
 * @author Alex Osorio
 */
public interface IArticulosServicio extends IGenericoServicio<Articulos>{
    public List<Articulos> buscarPorNombre(String nombre);
    
}
