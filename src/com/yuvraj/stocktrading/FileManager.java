package com.yuvraj.stocktrading;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    // Save Single Data
    public static void saveData(String data, String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write(data);
            writer.newLine();

        } catch (IOException e) {

            System.out.println("Error saving file : " + e.getMessage());

        }
    }

    // Save Complete Portfolio
    public static void savePortfolio(User user, String fileName) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("========== USER DETAILS ==========");
            writer.newLine();

            writer.write("User Name : " + user.getUserName());
            writer.newLine();

            writer.write("Balance : ₹" + user.getBalance());
            writer.newLine();
            writer.newLine();

            writer.write("========== PORTFOLIO ==========");
            writer.newLine();

            if (user.getPortfolio().isEmpty()) {

                writer.write("Portfolio is Empty.");
                writer.newLine();

            } else {

                for (PortfolioItem item : user.getPortfolio()) {

                    writer.write(item.toString());
                    writer.newLine();
                    writer.write("--------------------------------------");
                    writer.newLine();

                }

            }

            System.out.println("Portfolio saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving portfolio : " + e.getMessage());

        }
    }
}