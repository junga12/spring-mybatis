package com.junga.user.mapper;

import com.junga.user.dto.UserDto;

import java.util.List;

public interface UserMapper {

    public List<UserDto> selectAllUser() throws Exception;
}
