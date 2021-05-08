package com.anup.springdemo.mapper;

import com.anup.springdemo.dto.StockDTO;
import com.anup.springdemo.external.response.AllStockResponse;
import com.anup.springdemo.external.response.ExternalGenericResponse;
import com.anup.springdemo.response.GenericResponseWrapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
public class StockMapper {

    public static GenericResponseWrapper mapExternalAllStockResponse(ExternalGenericResponse externalGenericResponse) {
        GenericResponseWrapper response = new GenericResponseWrapper();

        if (externalGenericResponse.getIsResultObtained()) {
            AllStockResponse allStockResponse = (AllStockResponse) externalGenericResponse.getResponse();

            final List<AllStockResponse.Data> data = allStockResponse.getData();
            final List<StockDTO> finalResponse = data
                    .stream()
                    .map(
                            (stock) -> {
                                StockDTO stockDTO = new StockDTO();
                                stockDTO.setName(stock.getName());
                                stockDTO.setCurrentMarketPrice(stock.getCurrentMarketPrice());
                                return stockDTO;
                            }
                    ).collect(Collectors.toList());

            response.setResultCode(1);
            response.setResultDescription("Stock fetched");
            response.setData(finalResponse);
        } else {
            response.setResultCode(1);
            response.setResultDescription("Stock Service Currently Not Available");
        }

        return response;
    }
}
