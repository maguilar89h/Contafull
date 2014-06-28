package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Bodegas;
import com.trollsoft.contafull.entities.Cajas;
import com.trollsoft.contafull.entities.DetallesDocumento;
import com.trollsoft.contafull.entities.Documentos;
import com.trollsoft.contafull.entities.FormasPago;
import com.trollsoft.contafull.entities.Terceros;
import com.trollsoft.contafull.entities.TiposDocumento;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Documentos.class)
public class Documentos_ { 

    public static volatile SingularAttribute<Documentos, Double> total;
    public static volatile SingularAttribute<Documentos, String> tipoReteiva;
    public static volatile SingularAttribute<Documentos, String> vendedor;
    public static volatile SingularAttribute<Documentos, Double> reteica;
    public static volatile SingularAttribute<Documentos, Bodegas> bodega;
    public static volatile SingularAttribute<Documentos, Integer> alerta;
    public static volatile SingularAttribute<Documentos, Double> totalIva;
    public static volatile SingularAttribute<Documentos, String> observaciones;
    public static volatile SingularAttribute<Documentos, Cajas> caja;
    public static volatile SingularAttribute<Documentos, Long> id;
    public static volatile SingularAttribute<Documentos, String> codigo;
    public static volatile SingularAttribute<Documentos, Double> descuento;
    public static volatile SingularAttribute<Documentos, Terceros> receptor;
    public static volatile SingularAttribute<Documentos, String> tipoRetefuente;
    public static volatile CollectionAttribute<Documentos, Documentos> documentosCollection;
    public static volatile SingularAttribute<Documentos, Documentos> documentoAsociado;
    public static volatile SingularAttribute<Documentos, FormasPago> formaPago;
    public static volatile SingularAttribute<Documentos, Double> subtotal;
    public static volatile SingularAttribute<Documentos, Date> fecha2;
    public static volatile SingularAttribute<Documentos, Date> fecha1;
    public static volatile CollectionAttribute<Documentos, DetallesDocumento> detallesDocumentoCollection;
    public static volatile SingularAttribute<Documentos, Double> reteiva;
    public static volatile SingularAttribute<Documentos, String> tipoReteica;
    public static volatile SingularAttribute<Documentos, Integer> estado;
    public static volatile SingularAttribute<Documentos, TiposDocumento> tipo;
    public static volatile SingularAttribute<Documentos, Terceros> emisor;
    public static volatile SingularAttribute<Documentos, Double> retefuente;

}