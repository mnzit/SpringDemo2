package com.anup.springdemo.controller;

import com.anup.springdemo.response.GenericResponseWrapper;
import com.anup.springdemo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manjit Shakya <manjit.shakya@f1soft.com>
 */
@RestController
@RequestMapping("stock")
public class StockController {

    @Autowired
    private StockService stockService;


    @GetMapping("all")
    public GenericResponseWrapper getAllStocks() {
        System.out.println("Called from demo app");
        return stockService.stocks();
    }
}
