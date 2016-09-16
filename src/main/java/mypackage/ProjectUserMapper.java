package mypackage;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Peter
 */
public class ProjectUserMapper {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAexamprep1PU");

    public void createUser(ProjectUser user) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        em.persist(user);

        em.getTransaction().commit();
        em.close();
    }

    public ProjectUser getUser(int key) {
        ProjectUser user;

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        user = em.find(ProjectUser.class, key);

        em.getTransaction().commit();
        em.close();

        return user;
    }

    public List<ProjectUser> getAllUsers() {

        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("select p from ProjectUser p", ProjectUser.class).getResultList();
        } finally {
            em.close();
        }
    }

}
