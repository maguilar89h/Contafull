package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.Cajas;
import com.trollsoft.contafull.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Arqueos.class)
public class Arqueos_ { 

    public static volatile SingularAttribute<Arqueos, Long> id;
    public static volatile SingularAttribute<Arqueos, Double> valorcierre;
    public static volatile SingularAttribute<Arqueos, Double> salidas;
    public static volatile SingularAttribute<Arqueos, Integer> estado;
    public static volatile SingularAttribute<Arqueos, Date> fechaapertura;
    public static volatile SingularAttribute<Arqueos, Usuarios> usuarioapertura;
    public static volatile SingularAttribute<Arqueos, Double> descuadre;
    public static volatile SingularAttribute<Arqueos, Double> valorapertura;
    public static volatile SingularAttribute<Arqueos, Usuarios> usuariocierre;
    public static volatile SingularAttribute<Arqueos, Cajas> caja;
    public static volatile SingularAttribute<Arqueos, Date> fechacierre;

}