package com.saas.Dashboard.service;

import com.saas.Dashboard.dto.UserDto;
import com.saas.Dashboard.misc.Role;
import com.saas.Dashboard.model.User;
import com.saas.Dashboard.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    UserRepo userRepo;

    public String addUser(UserDto userDto) {
        userRepo.save(User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .role(Role.valueOf("USER"))
                .build());
        return "User Created Successfully";
    }

    public String addAdmin(UserDto userDto) {
        userRepo.save(User.builder()
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .role(Role.valueOf("ADMIN"))
                .build());
        return "User Created Successfully";
    }
}
