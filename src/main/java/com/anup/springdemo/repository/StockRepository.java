package com.anup.springdemo.repository;

import com.anup.springdemo.dto.StockDTO;
import com.anup.springdemo.external.response.ExternalGenericResponse;

import java.util.List;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public interface StockRepository {

    ExternalGenericResponse findAll();
}
