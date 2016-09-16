package test;

import java.util.List;
import mypackage.Facade;
import mypackage.Project;
import mypackage.ProjectUser;

/**
 *
 * @author Peter
 */
public class Tester {

    public static void main(String[] args) {
        
        Facade fac = new Facade();
        
        fac.createProject(new Project("testproject", "testdesc"));
        
        fac.createUser(new ProjectUser("testuser", "test@mail.com"));
        
    }

}
