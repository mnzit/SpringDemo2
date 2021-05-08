package com.anup.springdemo.repository;

import com.anup.springdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Repository
public interface UserDatabaseRepository extends JpaRepository<User, Long> {
}
