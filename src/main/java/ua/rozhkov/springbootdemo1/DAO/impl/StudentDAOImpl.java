package ua.rozhkov.springbootdemo1.DAO.impl;

import org.springframework.stereotype.Component;
import ua.rozhkov.springbootdemo1.DAO.StudentDAO;
import ua.rozhkov.springbootdemo1.DAO.entities.Student;

import java.util.List;

@Component
public class StudentDAOImpl implements StudentDAO {
    @Override
    public Student getById(int id) {
        return null;
    }

    @Override
    public List<Student> getAll() {
        return null;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public int create(Student student) {
        return 0;
    }

    @Override
    public Student update(Student student) {
        return null;
    }
}
