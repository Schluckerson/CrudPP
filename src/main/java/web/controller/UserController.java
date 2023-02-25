package web.controller;

import web.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @GetMapping(value="/")
    public String initUsers(Model model) {
        model.addAttribute("users", allUsers());
        return "index";
    }

    public List<User> allUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("name1", "lastname1", "email1"));
        users.add(new User("name2", "lastname2", "email2"));
        users.add(new User("name3", "lastname3", "email3"));
        users.add(new User("name4", "lastname4", "email4"));
        users.add(new User("name5", "lastname5", "email5"));
        return users;
    }
}
