package pl.coderslab.concertsapp.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pl.coderslab.concertsapp.entity.Role;
import pl.coderslab.concertsapp.entity.User;
import pl.coderslab.concertsapp.repository.RoleRepository;
import pl.coderslab.concertsapp.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

   // private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository
                         ) {
      //  this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;

    }

    @Override
    @Transactional
    public User findByUserName(String username) {
        return userRepository.findByUsername(username);
    }
    @Override
    @Transactional
    public void saveUser(User user) {


        userRepository.save(user);
    }
}