package com.yuvraj.stocktrading;

import java.util.ArrayList;

public class User {

    // Attributes
    private String userName;
    private double balance;
    private ArrayList<PortfolioItem> portfolio;

    // Constructor
    public User(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
        this.portfolio = new ArrayList<>();
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<PortfolioItem> getPortfolio() {
        return portfolio;
    }

    // Setters
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Buy Stock
    public void buyStock(Stock stock, int quantity) {

        double totalCost = stock.getStockPrice() * quantity;

        if (balance < totalCost) {
            System.out.println("Insufficient Balance!");
            return;
        }

        balance -= totalCost;

        // Check if stock already exists
        for (PortfolioItem item : portfolio) {

            if (item.getStock().getStockName()
                    .equalsIgnoreCase(stock.getStockName())) {

                item.setStockQuantity(item.getStockQuantity() + quantity);

                System.out.println(quantity + " shares of "
                        + stock.getStockName()
                        + " purchased successfully.");

                return;
            }
        }

        // New Stock
        portfolio.add(new PortfolioItem(stock, quantity));

        System.out.println(quantity + " shares of "
                + stock.getStockName()
                + " purchased successfully.");
    }

    // Sell Stock
    public void sellStock(Stock stock, int quantity) {

        for (PortfolioItem item : portfolio) {

            if (item.getStock().getStockName()
                    .equalsIgnoreCase(stock.getStockName())) {

                if (item.getStockQuantity() < quantity) {

                    System.out.println("Not enough shares!");
                    return;
                }

                item.setStockQuantity(item.getStockQuantity() - quantity);

                balance += stock.getStockPrice() * quantity;

                // Remove stock if quantity becomes zero
                if (item.getStockQuantity() == 0) {
                    portfolio.remove(item);
                }

                System.out.println(quantity + " shares of "
                        + stock.getStockName()
                        + " sold successfully.");

                return;
            }
        }

        System.out.println("Stock not found in portfolio.");
    }

    // View Portfolio
    public void viewPortfolio() {

        if (portfolio.isEmpty()) {
            System.out.println("Portfolio is Empty.");
            return;
        }

        System.out.println("\n========== PORTFOLIO ==========");

        for (PortfolioItem item : portfolio) {
            System.out.println(item);
            System.out.println("-------------------------------");
        }

        System.out.println("Available Balance : ₹" + balance);
    }

    // toString()
    @Override
    public String toString() {
        return "User Name : " + userName +
                "\nBalance : ₹" + balance +
                "\nPortfolio : " + portfolio;
    }
}