package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Documentos;
import com.trollsoft.contafull.entities.Inventarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Bodegas.class)
public class Bodegas_ { 

    public static volatile SingularAttribute<Bodegas, Integer> id;
    public static volatile SingularAttribute<Bodegas, String> nombre;
    public static volatile SingularAttribute<Bodegas, Integer> estado;
    public static volatile CollectionAttribute<Bodegas, Inventarios> inventariosCollection;
    public static volatile SingularAttribute<Bodegas, String> descripcion;
    public static volatile CollectionAttribute<Bodegas, Documentos> documentosCollection;
    public static volatile SingularAttribute<Bodegas, String> ubicacion;

}