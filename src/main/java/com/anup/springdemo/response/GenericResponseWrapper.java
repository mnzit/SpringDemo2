package com.anup.springdemo.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class GenericResponseWrapper implements Serializable {

    private Integer resultCode;
    private String resultDescription;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Object data;
}
