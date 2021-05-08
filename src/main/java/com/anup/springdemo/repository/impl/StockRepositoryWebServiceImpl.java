package com.anup.springdemo.repository.impl;

import com.anup.springdemo.external.response.AllStockResponse;
import com.anup.springdemo.external.response.ExternalGenericResponse;
import com.anup.springdemo.repository.StockRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@Repository
public class StockRepositoryWebServiceImpl implements StockRepository {

    @Override
    public ExternalGenericResponse findAll() {
        RestTemplate restTemplate = new RestTemplate();
        ExternalGenericResponse externalGenericResponse = new ExternalGenericResponse();
        externalGenericResponse.setIsResultObtained(false);
        try {
            final ResponseEntity<AllStockResponse> forEntity = restTemplate.getForEntity("http://localhost:8081/stock/all", AllStockResponse.class);
            externalGenericResponse.setIsResultObtained(true);
            externalGenericResponse.setResponse(forEntity.getBody());
        }catch ( Exception exception){
            System.out.println("Error Occured");

        }
        return externalGenericResponse;
    }
}
