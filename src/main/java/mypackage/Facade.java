package mypackage;

import java.util.List;

/**
 *
 * @author Peter
 */
public class Facade {
    
    private ProjectUserMapper pum = new ProjectUserMapper();
    private ProjectMapper prm = new ProjectMapper();
    
    public void createUser(ProjectUser user) {
        pum.createUser(user);
    }
    public ProjectUser getUser(int key) {
        return pum.getUser(key);
    }
    public List getAllUsers() {
        return pum.getAllUsers();
    }
    public void createProject(Project project) {
        prm.createProject(project);
    }
    public void assignUserToProject(Project project, ProjectUser user) {
        project.assignUser(user);
    }
    
}
