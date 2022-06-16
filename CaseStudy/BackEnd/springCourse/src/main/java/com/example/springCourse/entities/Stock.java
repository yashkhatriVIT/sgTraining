package com.example.springCourse.entities;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import java.io.Serializable;
import java.math.BigDecimal;

class CompositeKey implements Serializable {
    private String date;
    private String time;
}
@Entity
@Table
@IdClass(CompositeKey.class)
public class Stock implements Serializable {
    private long compId;
    @Id
    private String date;
    @Id
    private String time;
//    @DecimalMin(value = "100000000", inclusive = true)
    private BigDecimal stkPrice;

    public Stock() {
    }
    public Stock(long compId, String date, String time, BigDecimal stkPrice) {
        this.compId = compId;
        this.date = date;
        this.time = time;
        this.stkPrice = stkPrice;
    }

    public long getCompId() {
        return compId;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public BigDecimal getStkPrice() {
        return stkPrice;
    }

    public void setCompId(long compId) {
        this.compId = compId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setStkPrice(BigDecimal stkPrice) {
        this.stkPrice = stkPrice;
    }

    @Override
    public String toString() {
        return "Stock{" +
                ", compId=" + compId +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", stkPrice=" + stkPrice +
                '}';
    }
}

