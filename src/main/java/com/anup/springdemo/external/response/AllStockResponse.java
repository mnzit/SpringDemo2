package com.anup.springdemo.external.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AllStockResponse implements Serializable {

    private Integer resultCode;
    private String resultDescription;
    private List<Data> data;


    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Data implements Serializable{
        private String name;
        private Double currentMarketPrice;
    }
}
