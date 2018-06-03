package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Clientes;
import modelo.Viagens;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-29T18:40:30")
@StaticMetamodel(Reservas.class)
public class Reservas_ { 

    public static volatile SingularAttribute<Reservas, Viagens> viagensId;
    public static volatile SingularAttribute<Reservas, Clientes> clientesId;
    public static volatile SingularAttribute<Reservas, Integer> id;

}