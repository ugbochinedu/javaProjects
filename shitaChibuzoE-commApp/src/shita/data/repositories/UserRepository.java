package shita.data.repositories;

import shita.data.model.User;

import java.util.List;

public interface UserRepository {

    User save(User user);
    void delete(User user);
    void delete(int id);
    List<User> findAll();
    User findById(int id);
    long count();
}
