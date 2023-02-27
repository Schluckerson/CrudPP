package web.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import web.model.User;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class UserDao {

    @PersistenceContext(name = "userManager")
    private EntityManager entityManager;

    public void saveUser(User user) {
        entityManager.persist(user);
    }
    public void deleteUserById(int id) {
        entityManager.createQuery("DELETE User user where user.id = :id")
                .setParameter("id", id)
                .executeUpdate();
    }

    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    public void updateUser(User user, int id) {
        User ouser = getUserById(id);
        ouser.setEmail(user.getEmail());
        ouser.setName(user.getName());
        ouser.setLastName(user.getLastName());
        entityManager.flush();
    }

    public List<User> getAllUsers () {
        return entityManager.createQuery("from User", User.class).getResultList();
    }
    public void cleanUsersTable() {}
}
