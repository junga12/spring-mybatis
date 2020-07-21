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
}
