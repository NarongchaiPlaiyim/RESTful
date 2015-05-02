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
            return userMapper.findAll();
        }finally{
            sqlSession.close();
        }
    }

    public User findById(Integer userId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            return userMapper.selectByPrimaryKey(userId);
        }finally{
            sqlSession.close();
        }
    }

    public void insert(User user){
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.insert(user);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void deleteUser(Integer userId) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.deleteByPrimaryKey(userId);
            sqlSession.commit();
        }finally{
            sqlSession.close();
        }
    }

    public void updateUser(User user) {
        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            userMapper.updateByPrimaryKey(user);
            sqlSession.commit();
        } finally {
            sqlSession.close();
        }
    }

}
