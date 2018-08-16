package ua.rozhkov.springbootdemo1.services;

import org.springframework.stereotype.Service;
import ua.rozhkov.springbootdemo1.DAO.GroupDAO;
import ua.rozhkov.springbootdemo1.DAO.entities.Group;
import ua.rozhkov.springbootdemo1.DAO.impl.GroupDAOImpl;

import java.util.List;

@Service
public class GroupService implements GroupDAO {

    private GroupDAOImpl groupDAO;

    public GroupService(GroupDAOImpl groupDAO) {
        this.groupDAO = groupDAO;
    }

    @Override
    public Group getById(int id) {
        return null;
    }

    public List<Group> getAll() {
        return groupDAO.getAll();
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
