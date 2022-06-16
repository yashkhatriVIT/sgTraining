package com.example.springCourse.controller;

import com.example.springCourse.entities.Stock;
import com.example.springCourse.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
@RestController
public class StkController {
    @Autowired
    private StockService stockService;
    @GetMapping("/")
    public String getStocks(){
        return "Hello";
    }
    @GetMapping("/api/v/1.0/market/stock/get/{id}/{startDate}/{endDate}")
    public List<Stock> getStocks(@PathVariable String id, @PathVariable String startDate, @PathVariable String endDate){
        return this.stockService.getStocks(Long.parseLong(id), startDate, endDate);
    }

    @PostMapping("/api/v1.0/market/stock/add/{id}")
    public Stock addStock(@PathVariable String id, @RequestBody String stkPrice){
        BigDecimal bigDecimal = new BigDecimal(stkPrice);
        return this.stockService.addStock(Long.parseLong(id), bigDecimal);
    }
}
