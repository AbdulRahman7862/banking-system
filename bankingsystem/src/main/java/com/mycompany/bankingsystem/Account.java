/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
class Account {

    private Customer customer; // Encapsulation applied
    private double balance; // Renamed for clarity
    private List<String> transactionLog; // Replaced array with dynamic list

    public Account(Customer customer) {
        this.customer = customer;
        this.balance = 0;
        this.transactionLog = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logTransaction("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            logTransaction("Withdrew: " + amount);
        } else if (amount > balance) {
            logTransaction("Failed withdrawal: Insufficient funds for amount " + amount);
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void printStatement() {
        System.out.println("Statement for " + customer.getName());
        for (String log : transactionLog) {
            System.out.println(log);
        }
        System.out.println("Balance: " + balance);
    }

    private void logTransaction(String message) {
        transactionLog.add(message);
    }

    public double getBalance() {
        return balance; // Getter for balance
    }

    public List<String> getTransactionLog() {
        return new ArrayList<>(transactionLog); // Return a copy to preserve encapsulation
    }

}
