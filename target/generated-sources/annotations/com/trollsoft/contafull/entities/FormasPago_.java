package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Documentos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(FormasPago.class)
public class FormasPago_ { 

    public static volatile SingularAttribute<FormasPago, Integer> id;
    public static volatile SingularAttribute<FormasPago, String> nombre;
    public static volatile SingularAttribute<FormasPago, Integer> estado;
    public static volatile SingularAttribute<FormasPago, String> descripcion;
    public static volatile CollectionAttribute<FormasPago, Documentos> documentosCollection;

}