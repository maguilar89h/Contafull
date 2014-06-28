package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Articulos;
import com.trollsoft.contafull.entities.Documentos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(DetallesDocumento.class)
public class DetallesDocumento_ { 

    public static volatile SingularAttribute<DetallesDocumento, Double> total;
    public static volatile SingularAttribute<DetallesDocumento, String> tipoReteiva;
    public static volatile SingularAttribute<DetallesDocumento, Double> reteica;
    public static volatile SingularAttribute<DetallesDocumento, Articulos> articulo;
    public static volatile SingularAttribute<DetallesDocumento, Double> ivaPtj;
    public static volatile SingularAttribute<DetallesDocumento, String> descripcion;
    public static volatile SingularAttribute<DetallesDocumento, Documentos> documento;
    public static volatile SingularAttribute<DetallesDocumento, Double> descuentoPtj;
    public static volatile SingularAttribute<DetallesDocumento, Double> subtotal;
    public static volatile SingularAttribute<DetallesDocumento, Long> id;
    public static volatile SingularAttribute<DetallesDocumento, Double> iva;
    public static volatile SingularAttribute<DetallesDocumento, Double> reteiva;
    public static volatile SingularAttribute<DetallesDocumento, String> tipoReteica;
    public static volatile SingularAttribute<DetallesDocumento, Double> descuento;
    public static volatile SingularAttribute<DetallesDocumento, Integer> estado;
    public static volatile SingularAttribute<DetallesDocumento, Double> valor;
    public static volatile SingularAttribute<DetallesDocumento, Integer> cantidad;
    public static volatile SingularAttribute<DetallesDocumento, String> tipoRetefuente;
    public static volatile SingularAttribute<DetallesDocumento, Double> retefuente;

}