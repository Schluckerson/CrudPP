package web.dao;

import web.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDao {

    @PersistenceContext
    EntityManager entityManager;

    public void createUsersTable() {
    }
    public void dropUsersTable() {}
    public void saveUser() {}
    public void removeUserById() {}
    public List<User> getAllUsers () {return null;}
    public void cleanUsersTable() {}
}
