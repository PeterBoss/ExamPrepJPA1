package mypackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Peter
 */
public class ProjectMapper {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAexamprep1PU");

    public void createProject(Project project) {

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(project);

        em.getTransaction().commit();
        em.close();

    }
    
    
}
