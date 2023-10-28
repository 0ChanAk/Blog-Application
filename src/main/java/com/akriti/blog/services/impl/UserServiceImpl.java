package com.akriti.blog.services.impl;

import com.akriti.blog.entities.User;
import com.akriti.blog.payloads.UserDto;
import com.akriti.blog.repository.UserRepo;
import com.akriti.blog.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepo userRepo;

    @Override
    public UserDto createUser(UserDto user) {

        return null;
    }

    @Override
    public UserDto updateUser(UserDto user, Integer userId) {
        return null;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }
    private User dtoToUser(UserDto userDto){
        User user = new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        //user.getEmail(userDto.getEmail());
        user.setAbout(userDto.getAbout());
        user.setPassword(userDto.getPassword());
        return user;
    }
    public UserDto UserToDto(User user){
        UserDto userDto= new UserDto();
        userDto.setId((user.getId()));
        userDto.setName(user.getName());
        //userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setAbout(user.getAbout());
        return userDto;
    }
}
