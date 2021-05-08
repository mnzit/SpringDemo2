package com.anup.springdemo.service.impl;

import com.anup.springdemo.external.response.AllStockResponse;
import com.anup.springdemo.external.response.ExternalGenericResponse;
import com.anup.springdemo.mapper.StockMapper;
import com.anup.springdemo.repository.StockRepository;
import com.anup.springdemo.response.GenericResponseWrapper;
import com.anup.springdemo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public GenericResponseWrapper stocks() {

        final ExternalGenericResponse externalResponse = stockRepository.findAll();
        return  StockMapper.mapExternalAllStockResponse(externalResponse);
    }
}
