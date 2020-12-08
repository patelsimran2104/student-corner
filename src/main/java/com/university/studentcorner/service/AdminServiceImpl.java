package com.university.studentcorner.service;

import com.university.studentcorner.exception.UserNotFoundException;
import com.university.studentcorner.model.Admin;
import com.university.studentcorner.model.User;
import com.university.studentcorner.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    private AdminRepository adminRepository;
    /**
     * @param admin object to insert in the database
     */
    @Override
    public void addUser(Admin admin) {
        adminRepository.save(admin);
    }

    /**
     * @return List of all Users in table category.
     */
    @Override
    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }

    /**
     * @param id to find User
     * @return User for a particular ID.
     */
    @Override
    public Admin getAdminById(int id) throws UserNotFoundException {
        Optional<Admin> optional = adminRepository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new UserNotFoundException();
        }
    }
}
