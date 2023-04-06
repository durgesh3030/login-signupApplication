package com.login.login.service;

import com.login.login.dto.UserDto;
import com.login.login.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save( UserDto userDto);
}
