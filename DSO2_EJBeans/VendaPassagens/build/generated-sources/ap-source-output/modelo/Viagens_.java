package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Reservas;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-29T18:40:30")
@StaticMetamodel(Viagens.class)
public class Viagens_ { 

    public static volatile SingularAttribute<Viagens, String> horario;
    public static volatile CollectionAttribute<Viagens, Reservas> reservasCollection;
    public static volatile SingularAttribute<Viagens, String> origem;
    public static volatile SingularAttribute<Viagens, Integer> id;
    public static volatile SingularAttribute<Viagens, String> destino;
    public static volatile SingularAttribute<Viagens, Integer> numeroAcentos;
    public static volatile SingularAttribute<Viagens, Integer> dia;

}