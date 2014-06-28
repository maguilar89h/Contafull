package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Arqueos;
import com.trollsoft.contafull.entities.Documentos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Cajas.class)
public class Cajas_ { 

    public static volatile SingularAttribute<Cajas, Integer> id;
    public static volatile SingularAttribute<Cajas, String> nombre;
    public static volatile SingularAttribute<Cajas, Integer> estado;
    public static volatile CollectionAttribute<Cajas, Arqueos> arqueosCollection;
    public static volatile SingularAttribute<Cajas, String> descripcion;
    public static volatile CollectionAttribute<Cajas, Documentos> documentosCollection;

}