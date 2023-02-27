package web.service;

import web.dao.UserDao;
import web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserService {

    private final UserDao dao;

    @Autowired
    public UserService(UserDao dao) {
        this.dao = dao;
    }

    @Transactional
    public void saveUser(User user) {
        dao.saveUser(user);
    }

    @Transactional
    public void deleteUserById(int id) {
        dao.deleteUserById(id);
    }

    @Transactional
    public User getUserById(int id) {
        return dao.getUserById(id);
    }

    @Transactional
    public void updateUser(User user, int id) {
        dao.updateUser(user, id);
    }

    @Transactional(readOnly = true)
    public List<User> getAllUsers () {
        return dao.getAllUsers();
    }
}
