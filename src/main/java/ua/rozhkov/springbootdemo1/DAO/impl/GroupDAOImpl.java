package ua.rozhkov.springbootdemo1.DAO.impl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import ua.rozhkov.springbootdemo1.DAO.GroupDAO;
import ua.rozhkov.springbootdemo1.DAO.entities.Group;

import java.util.List;

@Component
public class GroupDAOImpl implements GroupDAO {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Group getById(int id) {
        return sessionFactory.getCurrentSession().get(Group.class, id);
    }

    @Override
    public List<Group> getAll() {
        return null;
    }

    @Override
    public int deleteById(int id) {
        return 0;
    }

    @Override
    public int create(Group object) {
        return 0;
    }

    @Override
    public Group update(Group object) {
        return null;
    }
}
