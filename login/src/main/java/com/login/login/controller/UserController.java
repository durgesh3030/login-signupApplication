package com.login.login.controller;

import com.login.login.dto.UserDto;
import com.login.login.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/registration")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserDto userDto() {
        return new UserDto();
    }

    @GetMapping
    public String showForm() {
        return "registration";
    }

    @PostMapping
    public String registerUser(@ModelAttribute("user") UserDto userDto) {

        userService.save(userDto);
        return "redirect:/registration?success";
    }
}
