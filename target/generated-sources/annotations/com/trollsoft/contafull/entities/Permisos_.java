package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Perfiles;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Permisos.class)
public class Permisos_ { 

    public static volatile SingularAttribute<Permisos, Integer> id;
    public static volatile SingularAttribute<Permisos, String> nombre;
    public static volatile SingularAttribute<Permisos, Integer> estado;
    public static volatile SingularAttribute<Permisos, String> descripcion;
    public static volatile CollectionAttribute<Permisos, Perfiles> perfilesCollection;

}