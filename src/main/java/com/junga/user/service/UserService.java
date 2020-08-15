package com.junga.user.service;

import com.junga.user.dto.UserDto;

import java.util.List;

public interface UserService {

    public List<UserDto> getAllUser() throws Exception;

    public List<UserDto> getUser(int id) throws Exception;

    public boolean deleteUser(int id) throws Exception;

    public boolean insertUser(String username, String password) throws Exception;
}
