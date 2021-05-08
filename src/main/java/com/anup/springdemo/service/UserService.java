package com.anup.springdemo.service;

import com.anup.springdemo.response.GenericResponseWrapper;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public interface UserService {

    GenericResponseWrapper getAll();

    GenericResponseWrapper save();

    GenericResponseWrapper update();

    GenericResponseWrapper getOne(Long id);

    GenericResponseWrapper delete(Long id);
}
