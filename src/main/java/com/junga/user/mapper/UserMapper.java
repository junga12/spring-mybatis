package com.junga.user.mapper;

import com.junga.user.dto.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserDto> selectAllUser() throws Exception;

    UserDto selectUser(int id) throws Exception;

    void deleteUser(int id) throws Exception;

    void insertUser(@Param("UserDto") UserDto userDto) throws Exception;
}
