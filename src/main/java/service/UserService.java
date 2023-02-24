package service;

import dao.UserDao;
import model.User;
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
    public void createUsersTable() {
        dao.createUsersTable();
    }
    @Transactional
    public void dropUsersTable() {
        dao.dropUsersTable();
    }
    @Transactional
    public void saveUser() {
        dao.saveUser();
    }
    @Transactional
    public void removeUserById() {
        dao.removeUserById();
    }
    @Transactional(readOnly = true)
    public List<User> getAllUsers () {
        return dao.getAllUsers();
    }
    @Transactional
    public void cleanUsersTable() {
        dao.cleanUsersTable();
    }
}
