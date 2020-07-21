package com.junga.user.service;

import com.junga.user.dto.UserDto;

import java.util.List;

public interface UserService {

    public List<UserDto> getAllUser() throws Exception;
}
