package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Articulos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(CategoriasArticulo.class)
public class CategoriasArticulo_ { 

    public static volatile SingularAttribute<CategoriasArticulo, Integer> id;
    public static volatile SingularAttribute<CategoriasArticulo, String> nombre;
    public static volatile SingularAttribute<CategoriasArticulo, Integer> estado;
    public static volatile CollectionAttribute<CategoriasArticulo, Articulos> articulosCollection;
    public static volatile SingularAttribute<CategoriasArticulo, String> descripcion;

}