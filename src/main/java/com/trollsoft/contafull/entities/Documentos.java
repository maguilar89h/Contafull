/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.trollsoft.contafull.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alex Osorio
 */
@Entity
@Table(name = "documentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documentos.findAll", query = "SELECT d FROM Documentos d"),
    @NamedQuery(name = "Documentos.findById", query = "SELECT d FROM Documentos d WHERE d.id = :id"),
    @NamedQuery(name = "Documentos.findByAlerta", query = "SELECT d FROM Documentos d WHERE d.alerta = :alerta"),
    @NamedQuery(name = "Documentos.findByCodigo", query = "SELECT d FROM Documentos d WHERE d.codigo = :codigo"),
    @NamedQuery(name = "Documentos.findByDescuento", query = "SELECT d FROM Documentos d WHERE d.descuento = :descuento"),
    @NamedQuery(name = "Documentos.findByEstado", query = "SELECT d FROM Documentos d WHERE d.estado = :estado"),
    @NamedQuery(name = "Documentos.findByFecha1", query = "SELECT d FROM Documentos d WHERE d.fecha1 = :fecha1"),
    @NamedQuery(name = "Documentos.findByFecha2", query = "SELECT d FROM Documentos d WHERE d.fecha2 = :fecha2"),
    @NamedQuery(name = "Documentos.findByObservaciones", query = "SELECT d FROM Documentos d WHERE d.observaciones = :observaciones"),
    @NamedQuery(name = "Documentos.findByRetefuente", query = "SELECT d FROM Documentos d WHERE d.retefuente = :retefuente"),
    @NamedQuery(name = "Documentos.findByReteica", query = "SELECT d FROM Documentos d WHERE d.reteica = :reteica"),
    @NamedQuery(name = "Documentos.findByReteiva", query = "SELECT d FROM Documentos d WHERE d.reteiva = :reteiva"),
    @NamedQuery(name = "Documentos.findBySubtotal", query = "SELECT d FROM Documentos d WHERE d.subtotal = :subtotal"),
    @NamedQuery(name = "Documentos.findByTipoRetefuente", query = "SELECT d FROM Documentos d WHERE d.tipoRetefuente = :tipoRetefuente"),
    @NamedQuery(name = "Documentos.findByTipoReteica", query = "SELECT d FROM Documentos d WHERE d.tipoReteica = :tipoReteica"),
    @NamedQuery(name = "Documentos.findByTipoReteiva", query = "SELECT d FROM Documentos d WHERE d.tipoReteiva = :tipoReteiva"),
    @NamedQuery(name = "Documentos.findByTotal", query = "SELECT d FROM Documentos d WHERE d.total = :total"),
    @NamedQuery(name = "Documentos.findByTotalIva", query = "SELECT d FROM Documentos d WHERE d.totalIva = :totalIva"),
    @NamedQuery(name = "Documentos.findByVendedor", query = "SELECT d FROM Documentos d WHERE d.vendedor = :vendedor")})
public class Documentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "alerta")
    private Integer alerta;
    @Size(max = 255)
    @Column(name = "codigo")
    private String codigo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "descuento")
    private Double descuento;
    @Column(name = "estado")
    private Integer estado;
    @Column(name = "fecha1")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha1;
    @Column(name = "fecha2")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha2;
    @Size(max = 255)
    @Column(name = "observaciones")
    private String observaciones;
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
    @Column(name = "total_iva")
    private Double totalIva;
    @Size(max = 255)
    @Column(name = "vendedor")
    private String vendedor;
    @JoinColumn(name = "tipo", referencedColumnName = "id")
    @ManyToOne
    private TiposDocumento tipo;
    @JoinColumn(name = "receptor", referencedColumnName = "id")
    @ManyToOne
    private Terceros receptor;
    @JoinColumn(name = "emisor", referencedColumnName = "id")
    @ManyToOne
    private Terceros emisor;
    @JoinColumn(name = "forma_pago", referencedColumnName = "id")
    @ManyToOne
    private FormasPago formaPago;
    @OneToMany(mappedBy = "documentoAsociado")
    private Collection<Documentos> documentosCollection;
    @JoinColumn(name = "documento_asociado", referencedColumnName = "id")
    @ManyToOne
    private Documentos documentoAsociado;
    @JoinColumn(name = "caja", referencedColumnName = "id")
    @ManyToOne
    private Cajas caja;
    @JoinColumn(name = "bodega", referencedColumnName = "id")
    @ManyToOne
    private Bodegas bodega;
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "documento")
    private Collection<DetallesDocumento> detallesDocumentoCollection;

    public Documentos() {
    }

    public Documentos(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAlerta() {
        return alerta;
    }

    public void setAlerta(Integer alerta) {
        this.alerta = alerta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Date getFecha1() {
        return fecha1;
    }

    public void setFecha1(Date fecha1) {
        this.fecha1 = fecha1;
    }

    public Date getFecha2() {
        return fecha2;
    }

    public void setFecha2(Date fecha2) {
        this.fecha2 = fecha2;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
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

    public Double getTotalIva() {
        return totalIva;
    }

    public void setTotalIva(Double totalIva) {
        this.totalIva = totalIva;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public TiposDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TiposDocumento tipo) {
        this.tipo = tipo;
    }

    public Terceros getReceptor() {
        return receptor;
    }

    public void setReceptor(Terceros receptor) {
        this.receptor = receptor;
    }

    public Terceros getEmisor() {
        return emisor;
    }

    public void setEmisor(Terceros emisor) {
        this.emisor = emisor;
    }

    public FormasPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormasPago formaPago) {
        this.formaPago = formaPago;
    }

    @XmlTransient
    public Collection<Documentos> getDocumentosCollection() {
        return documentosCollection;
    }

    public void setDocumentosCollection(Collection<Documentos> documentosCollection) {
        this.documentosCollection = documentosCollection;
    }

    public Documentos getDocumentoAsociado() {
        return documentoAsociado;
    }

    public void setDocumentoAsociado(Documentos documentoAsociado) {
        this.documentoAsociado = documentoAsociado;
    }

    public Cajas getCaja() {
        return caja;
    }

    public void setCaja(Cajas caja) {
        this.caja = caja;
    }

    public Bodegas getBodega() {
        return bodega;
    }

    public void setBodega(Bodegas bodega) {
        this.bodega = bodega;
    }

    @XmlTransient
    public Collection<DetallesDocumento> getDetallesDocumentoCollection() {
        return detallesDocumentoCollection;
    }

    public void setDetallesDocumentoCollection(Collection<DetallesDocumento> detallesDocumentoCollection) {
        this.detallesDocumentoCollection = detallesDocumentoCollection;
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
        if (!(object instanceof Documentos)) {
            return false;
        }
        Documentos other = (Documentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.trollsoft.contafull.entities.Documentos[ id=" + id + " ]";
    }
    
}
