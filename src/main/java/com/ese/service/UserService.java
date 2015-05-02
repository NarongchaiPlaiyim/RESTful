package com.ese.service;

import com.ese.Utils.MyBatisUtil;
import com.ese.mapper.UserMapper;
import com.ese.model.User;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserService {
    public List<User> getAllUsers() {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.getAllUsers();
        }finally{
            sqlSession.close();
        }
    }
}
