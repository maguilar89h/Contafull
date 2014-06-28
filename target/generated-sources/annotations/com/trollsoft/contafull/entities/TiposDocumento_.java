package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Documentos;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(TiposDocumento.class)
public class TiposDocumento_ { 

    public static volatile SingularAttribute<TiposDocumento, Integer> id;
    public static volatile SingularAttribute<TiposDocumento, String> nombre;
    public static volatile SingularAttribute<TiposDocumento, String> formatoCodigo;
    public static volatile SingularAttribute<TiposDocumento, Integer> estado;
    public static volatile SingularAttribute<TiposDocumento, BigInteger> indice;
    public static volatile SingularAttribute<TiposDocumento, String> descripcion;
    public static volatile CollectionAttribute<TiposDocumento, Documentos> documentosCollection;
    public static volatile SingularAttribute<TiposDocumento, Integer> impactoInventario;

}