package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.User;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    void saveNewUser(User user);
    Optional<User> findById(ObjectId id);
    void deleteById(ObjectId id);
    User findByUserName(String userName);
}
