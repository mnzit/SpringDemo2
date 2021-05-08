package com.anup.springdemo.service.impl;

import com.anup.springdemo.model.User;
import com.anup.springdemo.repository.UserMemoryRepository;
import com.anup.springdemo.response.GenericResponseWrapper;
import com.anup.springdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMemoryRepository userMemoryRepository;

    @Override
    public GenericResponseWrapper getAll() {

        GenericResponseWrapper response = new GenericResponseWrapper();

        final List<User> users = userMemoryRepository.getAll();

        if (users != null && !users.isEmpty()) {
            response.setResultCode(1);
            response.setResultDescription("Users found successfully!");
            response.setData(users);
            return response;
        }

        response.setResultCode(0);
        response.setResultDescription("Users not found!");
        return response;
    }

    @Override
    public GenericResponseWrapper save() {
        return null;
    }

    @Override
    public GenericResponseWrapper update() {
        return null;
    }

    @Override
    public GenericResponseWrapper getOne(Long id) {
        return null;
    }

    @Override
    public GenericResponseWrapper delete(Long id) {
        return null;
    }
}
