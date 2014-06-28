/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alex Osorio
 */
@Entity
@Table(name = "arqueos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arqueos.findAll", query = "SELECT a FROM Arqueos a"),
    @NamedQuery(name = "Arqueos.findById", query = "SELECT a FROM Arqueos a WHERE a.id = :id"),
    @NamedQuery(name = "Arqueos.findByDescuadre", query = "SELECT a FROM Arqueos a WHERE a.descuadre = :descuadre"),
    @NamedQuery(name = "Arqueos.findByEstado", query = "SELECT a FROM Arqueos a WHERE a.estado = :estado"),
    @NamedQuery(name = "Arqueos.findByFechaapertura", query = "SELECT a FROM Arqueos a WHERE a.fechaapertura = :fechaapertura"),
    @NamedQuery(name = "Arqueos.findByFechacierre", query = "SELECT a FROM Arqueos a WHERE a.fechacierre = :fechacierre"),
    @NamedQuery(name = "Arqueos.findByValorapertura", query = "SELECT a FROM Arqueos a WHERE a.valorapertura = :valorapertura"),
    @NamedQuery(name = "Arqueos.findByValorcierre", query = "SELECT a FROM Arqueos a WHERE a.valorcierre = :valorcierre"),
    @NamedQuery(name = "Arqueos.findBySalidas", query = "SELECT a FROM Arqueos a WHERE a.salidas = :salidas")})
public class Arqueos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descuadre")
    private Double descuadre;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "fechaapertura")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaapertura;
    @Column(name = "fechacierre")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacierre;
    @Column(name = "valorapertura")
    private Double valorapertura;
    @Column(name = "valorcierre")
    private Double valorcierre;
    @Column(name = "salidas")
    private Double salidas;
    @JoinColumn(name = "usuariocierre", referencedColumnName = "id")
    @ManyToOne
    private Usuarios usuariocierre;
    @JoinColumn(name = "usuarioapertura", referencedColumnName = "id")
    @ManyToOne
    private Usuarios usuarioapertura;
    @JoinColumn(name = "caja", referencedColumnName = "id")
    @ManyToOne
    private Cajas caja;

    public Arqueos() {
    }

    public Arqueos(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getDescuadre() {
        return descuadre;
    }

    public void setDescuadre(Double descuadre) {
        this.descuadre = descuadre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getFechaapertura() {
        return fechaapertura;
    }

    public void setFechaapertura(Date fechaapertura) {
        this.fechaapertura = fechaapertura;
    }

    public Date getFechacierre() {
        return fechacierre;
    }

    public void setFechacierre(Date fechacierre) {
        this.fechacierre = fechacierre;
    }

    public Double getValorapertura() {
        return valorapertura;
    }

    public void setValorapertura(Double valorapertura) {
        this.valorapertura = valorapertura;
    }

    public Double getValorcierre() {
        return valorcierre;
    }

    public void setValorcierre(Double valorcierre) {
        this.valorcierre = valorcierre;
    }

    public Double getSalidas() {
        return salidas;
    }

    public void setSalidas(Double salidas) {
        this.salidas = salidas;
    }

    public Usuarios getUsuariocierre() {
        return usuariocierre;
    }

    public void setUsuariocierre(Usuarios usuariocierre) {
        this.usuariocierre = usuariocierre;
    }

    public Usuarios getUsuarioapertura() {
        return usuarioapertura;
    }

    public void setUsuarioapertura(Usuarios usuarioapertura) {
        this.usuarioapertura = usuarioapertura;
    }

    public Cajas getCaja() {
        return caja;
    }

    public void setCaja(Cajas caja) {
        this.caja = caja;
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
        if (!(object instanceof Arqueos)) {
            return false;
        }
        Arqueos other = (Arqueos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.Arqueos[ id=" + id + " ]";
    }
    
}
