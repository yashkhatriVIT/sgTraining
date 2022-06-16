package com.example.springCourse.services;

import com.example.springCourse.entities.Stock;
import com.example.springCourse.dao.StkDoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Service
public class StockServiceImpl implements StockService{
    @Autowired
    private StkDoa stkDoa;

    public StockServiceImpl() {

    }

    @Override
    public List<Stock> getStocks(long id, String startDate, String endDate) {
        return this.stkDoa.getData_between(id, startDate, endDate);
    }

    @Override
    public Stock addStock(long id, BigDecimal stkPrice) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = date.format(formatter);
        LocalTime time = LocalTime.now(); // Gets the current time
        formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String myTime = time.format(formatter);
        return this.stkDoa.save(new Stock(id, myDate, myTime, stkPrice));
    }
}
