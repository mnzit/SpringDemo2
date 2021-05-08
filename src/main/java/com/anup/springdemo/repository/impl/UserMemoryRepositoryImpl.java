package com.anup.springdemo.repository.impl;

import com.anup.springdemo.dto.UserDTO;
import com.anup.springdemo.model.User;
import com.anup.springdemo.repository.UserMemoryRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Repository
public class UserMemoryRepositoryImpl implements UserMemoryRepository {

    private List<User> users = new ArrayList<>();
    private Long id = 1L;

    public UserMemoryRepositoryImpl() {

        User user = new User();

        user.setId(id);
        user.setFirstname("Anup");
        user.setLastname("Dhunagana");
        user.setContactNo("9818623397");
        user.setEmailAddress("anup@gmail.com");
        user.setActive('Y');
        user.setCreatedDate(new Date());
        user.setModifiedDate(new Date());

        users.add(user);

        this.users = users;
        id++;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void save(UserDTO userDTO) {
        User user = new User();

        user.setId(id);
        user.setFirstname(userDTO.getFirstname());
        user.setLastname(userDTO.getLastname());
        user.setContactNo(userDTO.getContactNo());
        user.setEmailAddress(user.getEmailAddress());
        user.setActive('Y');
        user.setCreatedDate(new Date());
        user.setModifiedDate(new Date());

        users.add(user);
        id++;
    }

    @Override
    public void update(Long id, UserDTO userDTO) {

    }

    @Override
    public User getOne(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
