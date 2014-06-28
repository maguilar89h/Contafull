/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alex Osorio
 */
@Entity
@Table(name = "categorias_articulo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategoriasArticulo.findAll", query = "SELECT c FROM CategoriasArticulo c"),
    @NamedQuery(name = "CategoriasArticulo.findById", query = "SELECT c FROM CategoriasArticulo c WHERE c.id = :id"),
    @NamedQuery(name = "CategoriasArticulo.findByDescripcion", query = "SELECT c FROM CategoriasArticulo c WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CategoriasArticulo.findByEstado", query = "SELECT c FROM CategoriasArticulo c WHERE c.estado = :estado"),
    @NamedQuery(name = "CategoriasArticulo.findByNombre", query = "SELECT c FROM CategoriasArticulo c WHERE c.nombre = :nombre")})
public class CategoriasArticulo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Integer estado;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "categoria")
    private Collection<Articulos> articulosCollection;

    public CategoriasArticulo() {
    }

    public CategoriasArticulo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Articulos> getArticulosCollection() {
        return articulosCollection;
    }

    public void setArticulosCollection(Collection<Articulos> articulosCollection) {
        this.articulosCollection = articulosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategoriasArticulo)) {
            return false;
        }
        CategoriasArticulo other = (CategoriasArticulo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.CategoriasArticulo[ id=" + id + " ]";
    }
    
}
