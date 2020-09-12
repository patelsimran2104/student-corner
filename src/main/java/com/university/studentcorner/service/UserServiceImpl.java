package com.university.studentcorner.service;

import com.university.studentcorner.repository.UserRepository;
import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    /**
     * @param user object with values to save in database
     */
    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    /**
     * @return List of all users.
     */
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * @param id to find User
     * @return Object of User
     * @throws UserNotFoundException if user id does not exist
     */
    @Override
    public User getUserById(int id) throws UserNotFoundException {
        Optional<User> optional = userRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new UserNotFoundException();
        }
    }
}
