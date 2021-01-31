package com.excalibur.stock.stockservice.service;


import com.excalibur.stock.stockservice.model.Stock;
import java.util.List;

public interface IStockService {

    default List<Stock> findAll() {
        return null;
    }


}
