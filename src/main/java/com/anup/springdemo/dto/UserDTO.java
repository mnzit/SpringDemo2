package com.anup.springdemo.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Getter
@Setter
public class UserDTO implements Serializable {

    private String firstname;
    private String lastname;
    private String contactNo;
    private String emailAddress;

}
