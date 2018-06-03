package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Reservas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-29T18:40:30")
@StaticMetamodel(Clientes.class)
public class Clientes_ { 

    public static volatile SingularAttribute<Clientes, String> senha;
    public static volatile CollectionAttribute<Clientes, Reservas> reservasCollection;
    public static volatile SingularAttribute<Clientes, String> nome;
    public static volatile SingularAttribute<Clientes, Integer> id;
    public static volatile SingularAttribute<Clientes, String> login;
    public static volatile SingularAttribute<Clientes, String> email;

}