/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alex Osorio
 */
@Entity
@Table(name = "inventarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventarios.findAll", query = "SELECT i FROM Inventarios i"),
    @NamedQuery(name = "Inventarios.findByCantidad", query = "SELECT i FROM Inventarios i WHERE i.cantidad = :cantidad"),
    @NamedQuery(name = "Inventarios.findByEstado", query = "SELECT i FROM Inventarios i WHERE i.estado = :estado"),
    @NamedQuery(name = "Inventarios.findByStockalerta", query = "SELECT i FROM Inventarios i WHERE i.stockalerta = :stockalerta"),
    @NamedQuery(name = "Inventarios.findByStockmax", query = "SELECT i FROM Inventarios i WHERE i.stockmax = :stockmax"),
    @NamedQuery(name = "Inventarios.findByStockmin", query = "SELECT i FROM Inventarios i WHERE i.stockmin = :stockmin"),
    @NamedQuery(name = "Inventarios.findByArticulo", query = "SELECT i FROM Inventarios i WHERE i.inventariosPK.articulo = :articulo"),
    @NamedQuery(name = "Inventarios.findByBodega", query = "SELECT i FROM Inventarios i WHERE i.inventariosPK.bodega = :bodega")})
public class Inventarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InventariosPK inventariosPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "stockalerta")
    private Integer stockalerta;
    @Column(name = "stockmax")
    private Integer stockmax;
    @Column(name = "stockmin")
    private Integer stockmin;
    @JoinColumn(name = "bodega", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Bodegas bodegas;
    @JoinColumn(name = "articulo", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Articulos articulos;

    public Inventarios() {
    }

    public Inventarios(InventariosPK inventariosPK) {
        this.inventariosPK = inventariosPK;
    }

    public Inventarios(long articulo, int bodega) {
        this.inventariosPK = new InventariosPK(articulo, bodega);
    }

    public InventariosPK getInventariosPK() {
        return inventariosPK;
    }

    public void setInventariosPK(InventariosPK inventariosPK) {
        this.inventariosPK = inventariosPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Integer getStockalerta() {
        return stockalerta;
    }

    public void setStockalerta(Integer stockalerta) {
        this.stockalerta = stockalerta;
    }

    public Integer getStockmax() {
        return stockmax;
    }

    public void setStockmax(Integer stockmax) {
        this.stockmax = stockmax;
    }

    public Integer getStockmin() {
        return stockmin;
    }

    public void setStockmin(Integer stockmin) {
        this.stockmin = stockmin;
    }

    public Bodegas getBodegas() {
        return bodegas;
    }

    public void setBodegas(Bodegas bodegas) {
        this.bodegas = bodegas;
    }

    public Articulos getArticulos() {
        return articulos;
    }

    public void setArticulos(Articulos articulos) {
        this.articulos = articulos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inventariosPK != null ? inventariosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventarios)) {
            return false;
        }
        Inventarios other = (Inventarios) object;
        if ((this.inventariosPK == null && other.inventariosPK != null) || (this.inventariosPK != null && !this.inventariosPK.equals(other.inventariosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.Inventarios[ inventariosPK=" + inventariosPK + " ]";
    }
    
}
