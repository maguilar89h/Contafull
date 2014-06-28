package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Permisos;
import com.trollsoft.contafull.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Perfiles.class)
public class Perfiles_ { 

    public static volatile SingularAttribute<Perfiles, Integer> id;
    public static volatile SingularAttribute<Perfiles, String> nombre;
    public static volatile SingularAttribute<Perfiles, Integer> estado;
    public static volatile CollectionAttribute<Perfiles, Permisos> permisosCollection;
    public static volatile SingularAttribute<Perfiles, String> descripcion;
    public static volatile CollectionAttribute<Perfiles, Usuarios> usuariosCollection;

}