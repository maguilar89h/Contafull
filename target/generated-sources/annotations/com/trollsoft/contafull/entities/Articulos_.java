package com.trollsoft.contafull.entities;

import com.trollsoft.contafull.entities.CategoriasArticulo;
import com.trollsoft.contafull.entities.DetallesDocumento;
import com.trollsoft.contafull.entities.Inventarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-04-09T14:56:34")
@StaticMetamodel(Articulos.class)
public class Articulos_ { 

    public static volatile SingularAttribute<Articulos, Double> ivaPtj;
    public static volatile SingularAttribute<Articulos, String> descripcion;
    public static volatile SingularAttribute<Articulos, String> marca;
    public static volatile SingularAttribute<Articulos, String> observaciones;
    public static volatile SingularAttribute<Articulos, Double> valorUnit;
    public static volatile SingularAttribute<Articulos, Long> id;
    public static volatile SingularAttribute<Articulos, Double> iva;
    public static volatile SingularAttribute<Articulos, String> nombre;
    public static volatile CollectionAttribute<Articulos, DetallesDocumento> detallesDocumentoCollection;
    public static volatile SingularAttribute<Articulos, CategoriasArticulo> categoria;
    public static volatile SingularAttribute<Articulos, String> imagen;
    public static volatile SingularAttribute<Articulos, Integer> estado;
    public static volatile CollectionAttribute<Articulos, Inventarios> inventariosCollection;
    public static volatile SingularAttribute<Articulos, String> codigoBarra;
    public static volatile SingularAttribute<Articulos, String> modelo;

}