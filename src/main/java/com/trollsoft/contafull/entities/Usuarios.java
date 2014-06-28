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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "usuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findById", query = "SELECT u FROM Usuarios u WHERE u.id = :id"),
    @NamedQuery(name = "Usuarios.findByEstado", query = "SELECT u FROM Usuarios u WHERE u.estado = :estado"),
    @NamedQuery(name = "Usuarios.findByNick", query = "SELECT u FROM Usuarios u WHERE u.nick = :nick"),
    @NamedQuery(name = "Usuarios.findByPassword", query = "SELECT u FROM Usuarios u WHERE u.password = :password"),
    @NamedQuery(name = "Usuarios.findByPerfil", query = "SELECT u FROM Usuarios u WHERE u.perfil = :perfil")})
public class Usuarios implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "estado")
    private Integer estado;
    @Size(max = 255)
    @Column(name = "nick")
    private String nick;
    @Size(max = 255)
    @Column(name = "password")
    private String password;
    @Column(name = "perfil")
    private Integer perfil;
    @ManyToMany(mappedBy = "usuariosCollection")
    private Collection<Perfiles> perfilesCollection;
    @OneToMany(mappedBy = "usuariocierre")
    private Collection<Arqueos> arqueosCollection;
    @OneToMany(mappedBy = "usuarioapertura")
    private Collection<Arqueos> arqueosCollection1;
    @JoinColumn(name = "tercero", referencedColumnName = "id")
    @ManyToOne
    private Terceros tercero;

    public Usuarios() {
    }

    public Usuarios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPerfil() {
        return perfil;
    }

    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }

    @XmlTransient
    public Collection<Perfiles> getPerfilesCollection() {
        return perfilesCollection;
    }

    public void setPerfilesCollection(Collection<Perfiles> perfilesCollection) {
        this.perfilesCollection = perfilesCollection;
    }

    @XmlTransient
    public Collection<Arqueos> getArqueosCollection() {
        return arqueosCollection;
    }

    public void setArqueosCollection(Collection<Arqueos> arqueosCollection) {
        this.arqueosCollection = arqueosCollection;
    }

    @XmlTransient
    public Collection<Arqueos> getArqueosCollection1() {
        return arqueosCollection1;
    }

    public void setArqueosCollection1(Collection<Arqueos> arqueosCollection1) {
        this.arqueosCollection1 = arqueosCollection1;
    }

    public Terceros getTercero() {
        return tercero;
    }

    public void setTercero(Terceros tercero) {
        this.tercero = tercero;
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
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.Usuarios[ id=" + id + " ]";
    }
    
}
