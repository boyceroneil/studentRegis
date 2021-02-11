package com.example.demo.crud;

import com.example.demo.entities.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.*;
@Repository
public class StudentIMPL implements CRUD{
    private final EntityManager manager;
    @Autowired
    public StudentIMPL(EntityManager manager){
        this.manager = manager;
    }


    @Override
    @Transactional
    public List<Object> searchAll() {
        Session current = manager.unwrap(Session.class);
        Query<Object>query = current.createQuery("from Student");
        return query.getResultList();
    }

    @Override
    @Transactional
    public Object searchId(int theId) {
        Session current = manager.unwrap(Session.class);
        return current;
    }

    @Override
    @Transactional
    public void saveUpdate(Object student) {
        Session current = manager.unwrap(Session.class);
        current.saveOrUpdate(student);

    }

    @Override
    @Transactional
    public void deleteId(int theId) {
        Session current = manager.unwrap(Session.class);
        Student student = current.get(Student.class, theId);
        current.delete(student);

    }
}
