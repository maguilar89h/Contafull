/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Alex Osorio
 */
@Embeddable
public class InventariosPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "articulo")
    private long articulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "bodega")
    private int bodega;

    public InventariosPK() {
    }

    public InventariosPK(long articulo, int bodega) {
        this.articulo = articulo;
        this.bodega = bodega;
    }

    public long getArticulo() {
        return articulo;
    }

    public void setArticulo(long articulo) {
        this.articulo = articulo;
    }

    public int getBodega() {
        return bodega;
    }

    public void setBodega(int bodega) {
        this.bodega = bodega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) articulo;
        hash += (int) bodega;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InventariosPK)) {
            return false;
        }
        InventariosPK other = (InventariosPK) object;
        if (this.articulo != other.articulo) {
            return false;
        }
        if (this.bodega != other.bodega) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.InventariosPK[ articulo=" + articulo + ", bodega=" + bodega + " ]";
    }
    
}
