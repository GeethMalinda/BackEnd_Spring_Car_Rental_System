//package lk.ijse.spring.service.impl;
//
//import lk.ijse.spring.entity.Role;
//import lk.ijse.spring.entity.User;
//import lk.ijse.spring.repo.RoleRepository;
//import lk.ijse.spring.repo.UserRepository;
//import lk.ijse.spring.service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.HashSet;
//
//@Service
//public class UserServiceImpl implements UserService {
//    @Autowired
//    private UserRepository userRepository;
//    @Autowired
//    private RoleRepository roleRepository;
//    @Autowired
//    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Override
//    public void save(User user) {
//        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setRoles(new HashSet(roleRepository.findAll()));
//        userRepository.save(user);
//    }
//
//
//    @Override
//    public User findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//}