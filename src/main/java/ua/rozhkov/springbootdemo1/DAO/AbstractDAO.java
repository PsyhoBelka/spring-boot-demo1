package ua.rozhkov.springbootdemo1.DAO;

import java.util.List;

public interface AbstractDAO<T> {
    T getById(int id);

    List<T> getAll();

    int deleteById(int id);

    int create(T object);

    T update(T object);
}
