package com.angular.study.myapi.service;

import com.angular.study.myapi.bean.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;


public interface UserRepository extends Repository<User, Integer> {

        User save(User user);
        List findAll();
        void delete(User user);
        User findById(int id);
}
