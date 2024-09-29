package com.ositran.ositran_office365_api;


import com.ositran.servicios.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService _userService;
    public UserController(@Autowired UserService userService) {
        _userService = userService;
    }
    @GetMapping("/hello")
    public String hello() {
        return _userService.hello();
    }
}
