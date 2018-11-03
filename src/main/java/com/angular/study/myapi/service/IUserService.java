package com.angular.study.myapi.service;

import com.angular.study.myapi.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IUserService {

    User create(User user);
    User update(User user);
    List findAll();
    User delete(int id);
    User findById(int id);

}
