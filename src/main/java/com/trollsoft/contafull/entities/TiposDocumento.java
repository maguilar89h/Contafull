/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.entities;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "tipos_documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TiposDocumento.findAll", query = "SELECT t FROM TiposDocumento t"),
    @NamedQuery(name = "TiposDocumento.findById", query = "SELECT t FROM TiposDocumento t WHERE t.id = :id"),
    @NamedQuery(name = "TiposDocumento.findByDescripcion", query = "SELECT t FROM TiposDocumento t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "TiposDocumento.findByEstado", query = "SELECT t FROM TiposDocumento t WHERE t.estado = :estado"),
    @NamedQuery(name = "TiposDocumento.findByFormatoCodigo", query = "SELECT t FROM TiposDocumento t WHERE t.formatoCodigo = :formatoCodigo"),
    @NamedQuery(name = "TiposDocumento.findByImpactoInventario", query = "SELECT t FROM TiposDocumento t WHERE t.impactoInventario = :impactoInventario"),
    @NamedQuery(name = "TiposDocumento.findByIndice", query = "SELECT t FROM TiposDocumento t WHERE t.indice = :indice"),
    @NamedQuery(name = "TiposDocumento.findByNombre", query = "SELECT t FROM TiposDocumento t WHERE t.nombre = :nombre")})
public class TiposDocumento implements Serializable {
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
    @Column(name = "formato_codigo")
    private String formatoCodigo;
    @Column(name = "impacto_inventario")
    private Integer impactoInventario;
    @Column(name = "indice")
    private BigInteger indice;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(mappedBy = "tipo")
    private Collection<Documentos> documentosCollection;

    public TiposDocumento() {
    }

    public TiposDocumento(Integer id) {
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

    public String getFormatoCodigo() {
        return formatoCodigo;
    }

    public void setFormatoCodigo(String formatoCodigo) {
        this.formatoCodigo = formatoCodigo;
    }

    public Integer getImpactoInventario() {
        return impactoInventario;
    }

    public void setImpactoInventario(Integer impactoInventario) {
        this.impactoInventario = impactoInventario;
    }

    public BigInteger getIndice() {
        return indice;
    }

    public void setIndice(BigInteger indice) {
        this.indice = indice;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Documentos> getDocumentosCollection() {
        return documentosCollection;
    }

    public void setDocumentosCollection(Collection<Documentos> documentosCollection) {
        this.documentosCollection = documentosCollection;
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
        if (!(object instanceof TiposDocumento)) {
            return false;
        }
        TiposDocumento other = (TiposDocumento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.TiposDocumento[ id=" + id + " ]";
    }
    
}
