package mypackage;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mypackage.ProjectUser;
import mypackage.Task;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-09-16T10:19:27")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, Date> created;
    public static volatile SingularAttribute<Project, String> name;
    public static volatile SingularAttribute<Project, String> description;
    public static volatile SingularAttribute<Project, Integer> id;
    public static volatile SingularAttribute<Project, Date> lastModified;
    public static volatile ListAttribute<Project, ProjectUser> projectUsers;
    public static volatile ListAttribute<Project, Task> tasks;

}