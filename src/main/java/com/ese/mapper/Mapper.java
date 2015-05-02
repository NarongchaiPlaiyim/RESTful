package com.ese.mapper;

import java.util.List;

public interface Mapper<T> {
    List<T> findAll();
    int insert(T record);
    T selectByPrimaryKey(Integer id);
    void updateByPrimaryKey(T object);
    void deleteByPrimaryKey(Integer id);
}
