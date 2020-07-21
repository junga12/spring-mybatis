package com.junga.user.service;

import com.junga.user.dao.UserDao;
import com.junga.user.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao UserDao;

    @Override
    public List<UserDto> getAllUser() throws Exception {
        return UserDao.selectAllUser();
    }
}
