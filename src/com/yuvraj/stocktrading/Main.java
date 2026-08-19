package com.yuvraj.stocktrading;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Available Stocks
        Stock tcs = new Stock("TCS", 3500);
        Stock infosys = new Stock("INFOSYS", 1600);
        Stock reliance = new Stock("RELIANCE", 2800);

        // User
        User user = new User("Yuvraj", 100000);

        while (true) {

            System.out.println("\n========== STOCK TRADING PLATFORM ==========");
            System.out.println("1. View Available Stocks");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Save Portfolio");
            System.out.println("6. Exit");

            System.out.print("\nEnter Your Choice : ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n========== AVAILABLE STOCKS ==========");

                    System.out.println(tcs);
                    System.out.println();

                    System.out.println(infosys);
                    System.out.println();

                    System.out.println(reliance);

                    break;

                case 2:

                    System.out.println("\nSelect Stock");
                    System.out.println("1. TCS");
                    System.out.println("2. INFOSYS");
                    System.out.println("3. RELIANCE");

                    System.out.print("Enter Stock Choice : ");
                    int buyChoice = sc.nextInt();

                    System.out.print("Enter Quantity : ");
                    int buyQuantity = sc.nextInt();

                    switch (buyChoice) {

                        case 1:
                            user.buyStock(tcs, buyQuantity);
                            break;

                        case 2:
                            user.buyStock(infosys, buyQuantity);
                            break;

                        case 3:
                            user.buyStock(reliance, buyQuantity);
                            break;

                        default:
                            System.out.println("Invalid Stock Choice!");
                    }

                    break;

                case 3:

                    System.out.println("\nSelect Stock");
                    System.out.println("1. TCS");
                    System.out.println("2. INFOSYS");
                    System.out.println("3. RELIANCE");

                    System.out.print("Enter Stock Choice : ");
                    int sellChoice = sc.nextInt();

                    System.out.print("Enter Quantity : ");
                    int sellQuantity = sc.nextInt();

                    switch (sellChoice) {

                        case 1:
                            user.sellStock(tcs, sellQuantity);
                            break;

                        case 2:
                            user.sellStock(infosys, sellQuantity);
                            break;

                        case 3:
                            user.sellStock(reliance, sellQuantity);
                            break;

                        default:
                            System.out.println("Invalid Stock Choice!");
                    }

                    break;

                case 4:

                    user.viewPortfolio();

                    break;

                case 5:

                    FileManager.savePortfolio(user, "data/portfolio.txt");

                    break;

                case 6:

                    System.out.println("\nThank You for Using Stock Trading Platform.");
                    sc.close();
                    System.exit(0);
                    break;

                default:

                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
    }
}
