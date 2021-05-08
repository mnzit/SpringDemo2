package com.anup.springdemo.repository;

import com.anup.springdemo.dto.UserDTO;
import com.anup.springdemo.model.User;

import java.util.List;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public interface UserMemoryRepository {

    List<User> getAll();

    void save(UserDTO userDTO);

    void update(Long id, UserDTO userDTO);

    User getOne(Long id);

    void delete(Long id);
}
