package com.junga.user.dao;

import com.junga.user.dto.UserDto;
import com.junga.user.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public class UserDao {

    @Autowired
    private SqlSession sqlSession;

    public List<UserDto> selectAllUser() throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectAllUser();
    }

    public UserDto selectUser(int id) throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        return userMapper.selectUser(id);
    }

    public void deleteUser(int id) throws Exception {
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteUser(id);
    }

    public void insertUser(UserDto userDto) throws Exception {
//        sqlSession.getMapper(UserMapper.class).insertUser(username, password);
        System.out.println(getClass().getName());
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertUser(userDto);
    }
}
