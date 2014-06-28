package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Documentos;
import com.trollsoft.contafull.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Terceros.class)
public class Terceros_ { 

    public static volatile SingularAttribute<Terceros, String> direccion;
    public static volatile SingularAttribute<Terceros, String> telefonos;
    public static volatile CollectionAttribute<Terceros, Documentos> documentosCollection1;
    public static volatile SingularAttribute<Terceros, String> tipoid;
    public static volatile SingularAttribute<Terceros, String> apellidos;
    public static volatile SingularAttribute<Terceros, Integer> digitoverificacion;
    public static volatile SingularAttribute<Terceros, Integer> id;
    public static volatile SingularAttribute<Terceros, String> numeroid;
    public static volatile SingularAttribute<Terceros, Integer> estado;
    public static volatile SingularAttribute<Terceros, String> nombres;
    public static volatile SingularAttribute<Terceros, Integer> tipo;
    public static volatile CollectionAttribute<Terceros, Documentos> documentosCollection;
    public static volatile SingularAttribute<Terceros, String> correos;
    public static volatile CollectionAttribute<Terceros, Usuarios> usuariosCollection;

}