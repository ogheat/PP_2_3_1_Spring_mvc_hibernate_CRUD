package web.service;

import web.model.Car;
import web.model.User;

import java.util.List;

public interface UserService {


    List<User> getUsers();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
}
