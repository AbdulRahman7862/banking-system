/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.bankingsystem;

/**
 *
 * @author user
 */
public class Bank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.run();
    }

    void run() {
        Customer customer = new Customer("Alice");
        Account account = new Account(customer);

        account.deposit(1000);
        account.withdraw(300);
        account.deposit(200);
        account.printStatement();
    }

}
