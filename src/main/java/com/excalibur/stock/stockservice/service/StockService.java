package com.excalibur.stock.stockservice.service;


import com.excalibur.stock.stockservice.model.Stock;
import com.excalibur.stock.stockservice.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StockService implements IStockService {

    @Autowired
    private StockRepository repository;

//    @Override
//    public List<Stock> findall() {
//
//        var tickers = (List<Stock>) repository.findall();
//
//        return tickers;
//    }
}
