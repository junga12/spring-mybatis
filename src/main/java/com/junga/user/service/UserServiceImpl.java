package com.junga.user.service;

import com.junga.user.dao.UserDao;
import com.junga.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao UserDao;

    @Override
    public List<UserDto> getAllUser() throws Exception {
        List<UserDto> userDtoList = UserDao.selectAllUser();
        return userDtoList;
    }

    @Override
    public List<UserDto> getUser(int id) throws Exception {
        List<UserDto> userDtoList = new ArrayList<UserDto>();
        userDtoList.add(UserDao.selectUser(id));
        return userDtoList;
    }

    @Override
    public boolean deleteUser(int id) throws Exception {
        if (UserDao.selectUser(id) != null) {
            UserDao.deleteUser(id);
            return true;
        } else return false;
    }

    @Override
    public boolean insertUser(String username, String password) throws Exception {
        UserDto userDto = new UserDto(username, password);
        UserDao.insertUser(userDto);
        return true;
    }
}
