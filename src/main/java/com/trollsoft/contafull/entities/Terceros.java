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
@Table(name = "terceros")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Terceros.findAll", query = "SELECT t FROM Terceros t"),
    @NamedQuery(name = "Terceros.findById", query = "SELECT t FROM Terceros t WHERE t.id = :id"),
    @NamedQuery(name = "Terceros.findByApellidos", query = "SELECT t FROM Terceros t WHERE t.apellidos = :apellidos"),
    @NamedQuery(name = "Terceros.findByDigitoverificacion", query = "SELECT t FROM Terceros t WHERE t.digitoverificacion = :digitoverificacion"),
    @NamedQuery(name = "Terceros.findByDireccion", query = "SELECT t FROM Terceros t WHERE t.direccion = :direccion"),
    @NamedQuery(name = "Terceros.findByEstado", query = "SELECT t FROM Terceros t WHERE t.estado = :estado"),
    @NamedQuery(name = "Terceros.findByNombres", query = "SELECT t FROM Terceros t WHERE t.nombres = :nombres"),
    @NamedQuery(name = "Terceros.findByNumeroid", query = "SELECT t FROM Terceros t WHERE t.numeroid = :numeroid"),
    @NamedQuery(name = "Terceros.findByTipo", query = "SELECT t FROM Terceros t WHERE t.tipo = :tipo"),
    @NamedQuery(name = "Terceros.findByTipoid", query = "SELECT t FROM Terceros t WHERE t.tipoid = :tipoid"),
    @NamedQuery(name = "Terceros.findByTelefonos", query = "SELECT t FROM Terceros t WHERE t.telefonos = :telefonos"),
    @NamedQuery(name = "Terceros.findByCorreos", query = "SELECT t FROM Terceros t WHERE t.correos = :correos")})
public class Terceros implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "apellidos")
    private String apellidos;
    @Column(name = "digitoverificacion")
    private Integer digitoverificacion;
    @Size(max = 255)
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "estado")
    private Integer estado;
    @Size(max = 255)
    @Column(name = "nombres")
    private String nombres;
    @Size(max = 255)
    @Column(name = "numeroid")
    private String numeroid;
    @Column(name = "tipo")
    private Integer tipo;
    @Size(max = 255)
    @Column(name = "tipoid")
    private String tipoid;
    @Size(max = 255)
    @Column(name = "telefonos")
    private String telefonos;
    @Size(max = 255)
    @Column(name = "correos")
    private String correos;
    @OneToMany(mappedBy = "receptor")
    private Collection<Documentos> documentosCollection;
    @OneToMany(mappedBy = "emisor")
    private Collection<Documentos> documentosCollection1;
    @OneToMany(mappedBy = "tercero")
    private Collection<Usuarios> usuariosCollection;

    public Terceros() {
    }

    public Terceros(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getDigitoverificacion() {
        return digitoverificacion;
    }

    public void setDigitoverificacion(Integer digitoverificacion) {
        this.digitoverificacion = digitoverificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNumeroid() {
        return numeroid;
    }

    public void setNumeroid(String numeroid) {
        this.numeroid = numeroid;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getTipoid() {
        return tipoid;
    }

    public void setTipoid(String tipoid) {
        this.tipoid = tipoid;
    }

    public String getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(String telefonos) {
        this.telefonos = telefonos;
    }

    public String getCorreos() {
        return correos;
    }

    public void setCorreos(String correos) {
        this.correos = correos;
    }

    @XmlTransient
    public Collection<Documentos> getDocumentosCollection() {
        return documentosCollection;
    }

    public void setDocumentosCollection(Collection<Documentos> documentosCollection) {
        this.documentosCollection = documentosCollection;
    }

    @XmlTransient
    public Collection<Documentos> getDocumentosCollection1() {
        return documentosCollection1;
    }

    public void setDocumentosCollection1(Collection<Documentos> documentosCollection1) {
        this.documentosCollection1 = documentosCollection1;
    }

    @XmlTransient
    public Collection<Usuarios> getUsuariosCollection() {
        return usuariosCollection;
    }

    public void setUsuariosCollection(Collection<Usuarios> usuariosCollection) {
        this.usuariosCollection = usuariosCollection;
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
        if (!(object instanceof Terceros)) {
            return false;
        }
        Terceros other = (Terceros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.Terceros[ id=" + id + " ]";
    }
    
}
