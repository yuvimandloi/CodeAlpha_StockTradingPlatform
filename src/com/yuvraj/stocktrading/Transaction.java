package com.yuvraj.stocktrading;

public class Transaction {

    // Attributes
    private String stockName;
    private int quantity;
    private double price;
    private String transactionType;

    // Constructor
    public Transaction(String stockName, int quantity, double price, String transactionType) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
        this.transactionType = transactionType;
    }

    // Getters
    public String getStockName() {
        return stockName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public String getTransactionType() {
        return transactionType;
    }

    // Setters
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    // toString()
    @Override
    public String toString() {
        return "Transaction Type : " + transactionType +
                "\nStock Name : " + stockName +
                "\nQuantity : " + quantity +
                "\nPrice : " + price;
    }
}