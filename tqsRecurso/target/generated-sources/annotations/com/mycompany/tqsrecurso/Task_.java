package com.mycompany.tqsrecurso;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-06T19:45:40")
@StaticMetamodel(Task.class)
public class Task_ { 

    public static volatile SingularAttribute<Task, Date> datelimit;
    public static volatile SingularAttribute<Task, String> author;
    public static volatile SingularAttribute<Task, String> description;
    public static volatile SingularAttribute<Task, Integer> id;
    public static volatile SingularAttribute<Task, String> title;
    public static volatile SingularAttribute<Task, String> priority;

}