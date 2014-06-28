/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "bodegas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bodegas.findAll", query = "SELECT b FROM Bodegas b"),
    @NamedQuery(name = "Bodegas.findById", query = "SELECT b FROM Bodegas b WHERE b.id = :id"),
    @NamedQuery(name = "Bodegas.findByDescripcion", query = "SELECT b FROM Bodegas b WHERE b.descripcion = :descripcion"),
    @NamedQuery(name = "Bodegas.findByEstado", query = "SELECT b FROM Bodegas b WHERE b.estado = :estado"),
    @NamedQuery(name = "Bodegas.findByNombre", query = "SELECT b FROM Bodegas b WHERE b.nombre = :nombre"),
    @NamedQuery(name = "Bodegas.findByUbicacion", query = "SELECT b FROM Bodegas b WHERE b.ubicacion = :ubicacion")})
public class Bodegas implements Serializable {
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
    @Size(max = 255)
    @Column(name = "ubicacion")
    private String ubicacion;
    @OneToMany(mappedBy = "bodega")
    private Collection<Documentos> documentosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bodegas")
    private Collection<Inventarios> inventariosCollection;

    public Bodegas() {
    }

    public Bodegas(Integer id) {
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @XmlTransient
    public Collection<Documentos> getDocumentosCollection() {
        return documentosCollection;
    }

    public void setDocumentosCollection(Collection<Documentos> documentosCollection) {
        this.documentosCollection = documentosCollection;
    }

    @XmlTransient
    public Collection<Inventarios> getInventariosCollection() {
        return inventariosCollection;
    }

    public void setInventariosCollection(Collection<Inventarios> inventariosCollection) {
        this.inventariosCollection = inventariosCollection;
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
        if (!(object instanceof Bodegas)) {
            return false;
        }
        Bodegas other = (Bodegas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.Bodegas[ id=" + id + " ]";
    }
    
}
