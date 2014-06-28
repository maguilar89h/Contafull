package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Articulos;
import com.trollsoft.contafull.entities.Bodegas;
import com.trollsoft.contafull.entities.InventariosPK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Inventarios.class)
public class Inventarios_ { 

    public static volatile SingularAttribute<Inventarios, Integer> estado;
    public static volatile SingularAttribute<Inventarios, InventariosPK> inventariosPK;
    public static volatile SingularAttribute<Inventarios, Integer> stockmax;
    public static volatile SingularAttribute<Inventarios, Articulos> articulos;
    public static volatile SingularAttribute<Inventarios, Integer> cantidad;
    public static volatile SingularAttribute<Inventarios, Integer> stockmin;
    public static volatile SingularAttribute<Inventarios, Bodegas> bodegas;
    public static volatile SingularAttribute<Inventarios, Integer> stockalerta;

}