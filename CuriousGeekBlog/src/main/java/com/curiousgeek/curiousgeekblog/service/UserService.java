package com.curiousgeek.curiousgeekblog.service;

import com.curiousgeek.curiousgeekblog.model.User;
import com.curiousgeek.curiousgeekblog.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
