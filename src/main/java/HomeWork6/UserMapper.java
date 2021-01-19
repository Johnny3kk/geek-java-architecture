package HomeWork6;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Stateless
public class UserMapper implements Serializable {

    private Logger logger = LoggerFactory.getLogger(UserMapper.class);


    @PersistenceContext(unitName = "ds")
    protected EntityManager em;

    public UserMapper() {
    }

    @TransactionAttribute
    public User merge(User user) {
        return em.merge(user);
    }

    @TransactionAttribute
    public void delete(int id) {
        logger.info("Deleting user");

        try {
            User attached = findById(id);
            if (attached != null) {
                em.remove(attached);
            }
        } catch (Exception ex) {
            logger.error("Error with entity class", ex);
            throw new IllegalStateException(ex);
        }
    }

    public User findById(int id) {
        return em.find(User.class, id);
    }

    @TransactionAttribute
    public List<User> findAllUsers() {
        return em.createQuery("from User u", User.class)
                .getResultList();
    }

}
