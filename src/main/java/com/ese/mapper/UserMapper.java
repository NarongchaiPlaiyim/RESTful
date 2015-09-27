package com.ese.mapper;

import com.ese.model.User;

import java.util.List;

public interface UserMapper extends Mapper<User> {
    int insert(User record);
    List<User> findAll();
    User selectByPrimaryKey(Integer userId);
    void updateByPrimaryKey(User user);
    void deleteByPrimaryKey(Integer usrId);
}
