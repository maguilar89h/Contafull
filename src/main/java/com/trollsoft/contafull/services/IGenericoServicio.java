/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.services;

import java.util.List;

/**
 *
 * @author Desarrollo
 */
public interface IGenericoServicio <T> {
   
    void crear(T perfil);

    void actualizar(T perfil);

    void eliminar(T perfil);

    T consultar(Object id);

    List<T> listar();

    List<T> listarLimite(int[] range);

    int contar();
     
}
