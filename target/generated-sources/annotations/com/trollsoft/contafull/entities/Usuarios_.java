package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Arqueos;
import com.trollsoft.contafull.entities.Perfiles;
import com.trollsoft.contafull.entities.Terceros;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, Integer> estado;
    public static volatile SingularAttribute<Usuarios, Terceros> tercero;
    public static volatile SingularAttribute<Usuarios, String> nick;
    public static volatile CollectionAttribute<Usuarios, Arqueos> arqueosCollection1;
    public static volatile CollectionAttribute<Usuarios, Arqueos> arqueosCollection;
    public static volatile SingularAttribute<Usuarios, Integer> perfil;
    public static volatile SingularAttribute<Usuarios, String> password;
    public static volatile CollectionAttribute<Usuarios, Perfiles> perfilesCollection;

}