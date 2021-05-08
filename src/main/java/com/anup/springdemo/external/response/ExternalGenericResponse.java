package com.anup.springdemo.external.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Getter
@Setter
public class ExternalGenericResponse{
    private Boolean isResultObtained;
    private Object response;
}
