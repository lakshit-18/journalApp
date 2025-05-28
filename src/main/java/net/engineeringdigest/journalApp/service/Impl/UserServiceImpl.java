package net.engineeringdigest.journalApp.service.Impl;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import net.engineeringdigest.journalApp.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public List<User> getAll() {
        return userRepository.findAll();
    }
    public void saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Arrays.asList("USERS"));
        userRepository.save(user);
    }
    public Optional<User> findById(ObjectId id) {
        return userRepository.findById(id);
    }
    public void deleteById(ObjectId id) {
        userRepository.deleteById(id);
    }
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
