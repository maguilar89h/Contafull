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
import javax.persistence.JoinColumn;
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
@Table(name = "articulos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Articulos.findAll", query = "SELECT a FROM Articulos a"),
    @NamedQuery(name = "Articulos.findById", query = "SELECT a FROM Articulos a WHERE a.id = :id"),
    @NamedQuery(name = "Articulos.findByDescripcion", query = "SELECT a FROM Articulos a WHERE a.descripcion = :descripcion"),
    @NamedQuery(name = "Articulos.findByEstado", query = "SELECT a FROM Articulos a WHERE a.estado = :estado"),
    @NamedQuery(name = "Articulos.findByIva", query = "SELECT a FROM Articulos a WHERE a.iva = :iva"),
    @NamedQuery(name = "Articulos.findByIvaPtj", query = "SELECT a FROM Articulos a WHERE a.ivaPtj = :ivaPtj"),
    @NamedQuery(name = "Articulos.findByMarca", query = "SELECT a FROM Articulos a WHERE a.marca = :marca"),
    @NamedQuery(name = "Articulos.findByModelo", query = "SELECT a FROM Articulos a WHERE a.modelo = :modelo"),
    @NamedQuery(name = "Articulos.findByNombre", query = "SELECT a FROM Articulos a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Articulos.findByObservaciones", query = "SELECT a FROM Articulos a WHERE a.observaciones = :observaciones"),
    @NamedQuery(name = "Articulos.findByValorUnit", query = "SELECT a FROM Articulos a WHERE a.valorUnit = :valorUnit"),
    @NamedQuery(name = "Articulos.findByImagen", query = "SELECT a FROM Articulos a WHERE a.imagen = :imagen"),
    @NamedQuery(name = "Articulos.findByCodigoBarra", query = "SELECT a FROM Articulos a WHERE a.codigoBarra = :codigoBarra")})
public class Articulos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Size(max = 2147483647)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "estado")
    private Integer estado;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "iva")
    private Double iva;
    @Column(name = "iva_ptj")
    private Double ivaPtj;
    @Size(max = 255)
    @Column(name = "marca")
    private String marca;
    @Size(max = 255)
    @Column(name = "modelo")
    private String modelo;
    @Size(max = 255)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "valor_unit")
    private Double valorUnit;
    @Size(max = 255)
    @Column(name = "imagen")
    private String imagen;
    @Size(max = 255)
    @Column(name = "codigo_barra")
    private String codigoBarra;
    @JoinColumn(name = "categoria", referencedColumnName = "id")
    @ManyToOne
    private CategoriasArticulo categoria;
    @OneToMany(mappedBy = "articulo")
    private Collection<DetallesDocumento> detallesDocumentoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "articulos")
    private Collection<Inventarios> inventariosCollection;

    public Articulos() {
    }

    public Articulos(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public CategoriasArticulo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriasArticulo categoria) {
        this.categoria = categoria;
    }

    @XmlTransient
    public Collection<DetallesDocumento> getDetallesDocumentoCollection() {
        return detallesDocumentoCollection;
    }

    public void setDetallesDocumentoCollection(Collection<DetallesDocumento> detallesDocumentoCollection) {
        this.detallesDocumentoCollection = detallesDocumentoCollection;
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
        if (!(object instanceof Articulos)) {
            return false;
        }
        Articulos other = (Articulos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.Articulos[ id=" + id + " ]";
    }
    
}
