//package com.university.studentcorner.service;
//
//import com.university.studentcorner.config.CustomUserDetails;
//import com.university.studentcorner.model.User;
//import com.university.studentcorner.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        //fetching user from database
//        User user = userRepository.getUserByUserName(username);
//
//        if(user==null){
//            throw new UsernameNotFoundException("could not found user");
//        }
//
//        CustomUserDetails customUserDetails= new CustomUserDetails(user);
//        return customUserDetails;
//    }
//}
