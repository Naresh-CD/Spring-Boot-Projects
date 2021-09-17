package com.curiousgeek.curiousgeekblog.service;

import com.curiousgeek.curiousgeekblog.model.Role;
import com.curiousgeek.curiousgeekblog.model.User;
import com.curiousgeek.curiousgeekblog.repository.UserRepository;
import com.curiousgeek.curiousgeekblog.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),
                             registrationDto.getLastName(),
                             registrationDto.getEmail(),
                             registrationDto.getPassword(),
                             Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

}
