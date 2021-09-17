package com.curiousgeek.curiousgeekblog.service;

import com.curiousgeek.curiousgeekblog.model.User;
import com.curiousgeek.curiousgeekblog.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);

}
