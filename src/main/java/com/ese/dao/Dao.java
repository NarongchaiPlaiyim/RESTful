package com.ese.dao;

import java.util.List;

public interface Dao<T> {
    public List findAll();
    public T find(Integer id);
    public T merge(T obj);
    public void delete(T obj);
}
