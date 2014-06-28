/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.entities;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alex Osorio
 */
@Entity
@Table(name = "detalles_documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallesDocumento.findAll", query = "SELECT d FROM DetallesDocumento d"),
    @NamedQuery(name = "DetallesDocumento.findById", query = "SELECT d FROM DetallesDocumento d WHERE d.id = :id"),
    @NamedQuery(name = "DetallesDocumento.findByCantidad", query = "SELECT d FROM DetallesDocumento d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DetallesDocumento.findByDescripcion", query = "SELECT d FROM DetallesDocumento d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "DetallesDocumento.findByDescuento", query = "SELECT d FROM DetallesDocumento d WHERE d.descuento = :descuento"),
    @NamedQuery(name = "DetallesDocumento.findByDescuentoPtj", query = "SELECT d FROM DetallesDocumento d WHERE d.descuentoPtj = :descuentoPtj"),
    @NamedQuery(name = "DetallesDocumento.findByEstado", query = "SELECT d FROM DetallesDocumento d WHERE d.estado = :estado"),
    @NamedQuery(name = "DetallesDocumento.findByIva", query = "SELECT d FROM DetallesDocumento d WHERE d.iva = :iva"),
    @NamedQuery(name = "DetallesDocumento.findByIvaPtj", query = "SELECT d FROM DetallesDocumento d WHERE d.ivaPtj = :ivaPtj"),
    @NamedQuery(name = "DetallesDocumento.findByRetefuente", query = "SELECT d FROM DetallesDocumento d WHERE d.retefuente = :retefuente"),
    @NamedQuery(name = "DetallesDocumento.findByReteica", query = "SELECT d FROM DetallesDocumento d WHERE d.reteica = :reteica"),
    @NamedQuery(name = "DetallesDocumento.findByReteiva", query = "SELECT d FROM DetallesDocumento d WHERE d.reteiva = :reteiva"),
    @NamedQuery(name = "DetallesDocumento.findBySubtotal", query = "SELECT d FROM DetallesDocumento d WHERE d.subtotal = :subtotal"),
    @NamedQuery(name = "DetallesDocumento.findByTipoRetefuente", query = "SELECT d FROM DetallesDocumento d WHERE d.tipoRetefuente = :tipoRetefuente"),
    @NamedQuery(name = "DetallesDocumento.findByTipoReteica", query = "SELECT d FROM DetallesDocumento d WHERE d.tipoReteica = :tipoReteica"),
    @NamedQuery(name = "DetallesDocumento.findByTipoReteiva", query = "SELECT d FROM DetallesDocumento d WHERE d.tipoReteiva = :tipoReteiva"),
    @NamedQuery(name = "DetallesDocumento.findByTotal", query = "SELECT d FROM DetallesDocumento d WHERE d.total = :total"),
    @NamedQuery(name = "DetallesDocumento.findByValor", query = "SELECT d FROM DetallesDocumento d WHERE d.valor = :valor")})
public class DetallesDocumento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descuento")
    private Double descuento;
    @Column(name = "descuento_ptj")
    private Double descuentoPtj;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "iva")
    private Double iva;
    @Column(name = "iva_ptj")
    private Double ivaPtj;
    @Column(name = "retefuente")
    private Double retefuente;
    @Column(name = "reteica")
    private Double reteica;
    @Column(name = "reteiva")
    private Double reteiva;
    @Column(name = "subtotal")
    private Double subtotal;
    @Size(max = 255)
    @Column(name = "tipo_retefuente")
    private String tipoRetefuente;
    @Size(max = 255)
    @Column(name = "tipo_reteica")
    private String tipoReteica;
    @Size(max = 255)
    @Column(name = "tipo_reteiva")
    private String tipoReteiva;
    @Column(name = "total")
    private Double total;
    @Column(name = "valor")
    private Double valor;
    @JoinColumn(name = "documento", referencedColumnName = "id")
    @ManyToOne
    private Documentos documento;
    @JoinColumn(name = "articulo", referencedColumnName = "id")
    @ManyToOne
    private Articulos articulo;

    public DetallesDocumento() {
    }

    public DetallesDocumento(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getDescuentoPtj() {
        return descuentoPtj;
    }

    public void setDescuentoPtj(Double descuentoPtj) {
        this.descuentoPtj = descuentoPtj;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getIvaPtj() {
        return ivaPtj;
    }

    public void setIvaPtj(Double ivaPtj) {
        this.ivaPtj = ivaPtj;
    }

    public Double getRetefuente() {
        return retefuente;
    }

    public void setRetefuente(Double retefuente) {
        this.retefuente = retefuente;
    }

    public Double getReteica() {
        return reteica;
    }

    public void setReteica(Double reteica) {
        this.reteica = reteica;
    }

    public Double getReteiva() {
        return reteiva;
    }

    public void setReteiva(Double reteiva) {
        this.reteiva = reteiva;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getTipoRetefuente() {
        return tipoRetefuente;
    }

    public void setTipoRetefuente(String tipoRetefuente) {
        this.tipoRetefuente = tipoRetefuente;
    }

    public String getTipoReteica() {
        return tipoReteica;
    }

    public void setTipoReteica(String tipoReteica) {
        this.tipoReteica = tipoReteica;
    }

    public String getTipoReteiva() {
        return tipoReteiva;
    }

    public void setTipoReteiva(String tipoReteiva) {
        this.tipoReteiva = tipoReteiva;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Documentos getDocumento() {
        return documento;
    }

    public void setDocumento(Documentos documento) {
        this.documento = documento;
    }

    public Articulos getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulos articulo) {
        this.articulo = articulo;
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
        if (!(object instanceof DetallesDocumento)) {
            return false;
        }
        DetallesDocumento other = (DetallesDocumento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.DetallesDocumento[ id=" + id + " ]";
    }
    
}
