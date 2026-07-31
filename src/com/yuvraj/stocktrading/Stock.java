package com.yuvraj.stocktrading;

public class Stock {

    //attribute
    private String stockName;
    private double stockPrice;

    //constructor
    public Stock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
    }

    //getter and setter
    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    // toString()
    @Override
    public String toString(){
        return "Stock Name : " + stockName +
                "\nStock Price : " + stockPrice;
    }
}
