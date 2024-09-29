package com.ositran.servicios;

import com.ositran.domain.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private IUserRepository _userRepository;
    public UserService(@Autowired IUserRepository userRepository) {
        _userRepository = userRepository;
    }
    public String hello() {
        return "Hello, " + _userRepository.getUserName();
    }
}
