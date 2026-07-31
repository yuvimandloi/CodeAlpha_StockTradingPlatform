package com.yuvraj.stocktrading;

public class PortfolioItem {

    //attributes
    private Stock stock;
    private int stockQuantity;

    //constructor
    public PortfolioItem(Stock stock, int stockQuantity){
        this.stock = stock;
        this.stockQuantity = stockQuantity;
    }

    //getter mothod
    public Stock getStock() {
        return stock;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    //setter method
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    // toString() method

    @Override
    public String toString() {
        return "Stock Details\n" +
                stock +
                "\nQuantity : " + stockQuantity;
    }
}
