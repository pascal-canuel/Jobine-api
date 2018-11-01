package entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-11-01T10:47:46")
@StaticMetamodel(Msg.class)
public class Msg_ { 

    public static volatile SingularAttribute<Msg, Integer> idMsg;
    public static volatile SingularAttribute<Msg, Integer> idUser;
    public static volatile SingularAttribute<Msg, Date> dateMsg;
    public static volatile SingularAttribute<Msg, String> contentMsg;
    public static volatile SingularAttribute<Msg, Integer> idOffer;

}