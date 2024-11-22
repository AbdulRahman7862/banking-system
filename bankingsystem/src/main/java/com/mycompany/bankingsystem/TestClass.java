///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.bankingsystem;
//
///**
// *
// * @author user
// */
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.List;
//
//class AccountTest {
//
//    @Test
//    void testDeposit() {
//        Customer customer = new Customer("Alice");
//        Account account = new Account(customer);
//
//        account.deposit(1000.0);
//        assertEquals(1000.0, account.getBalance(), "Balance should update after deposit");
//
//        account.deposit(500.0);
//        assertEquals(1500.0, account.getBalance(), "Balance should update after second deposit");
//    }
//
//    @Test
//    void testInvalidDeposit() {
//        Customer customer = new Customer("Alice");
//        Account account = new Account(customer);
//
//        account.deposit(-100.0); // Invalid deposit
//        assertEquals(0.0, account.getBalance(), "Balance should remain unchanged for invalid deposit");
//    }
//
//    @Test
//    void testWithdraw_SufficientFunds() {
//        Customer customer = new Customer("Alice");
//        Account account = new Account(customer);
//
//        account.deposit(1000.0);
//        account.withdraw(300.0);
//        assertEquals(700.0, account.getBalance(), "Balance should update correctly after withdrawal");
//    }
//
//    @Test
//    void testWithdraw_InsufficientFunds() {
//        Customer customer = new Customer("Alice");
//        Account account = new Account(customer);
//
//        account.deposit(100.0);
//        account.withdraw(200.0); // Attempt to withdraw more than balance
//        assertEquals(100.0, account.getBalance(), "Balance should remain unchanged if withdrawal fails");
//    }
//
//    @Test
//    void testInvalidWithdrawal() {
//        Customer customer = new Customer("Alice");
//        Account account = new Account(customer);
//
//        account.deposit(500.0);
//        account.withdraw(-100.0); // Invalid withdrawal
//        assertEquals(500.0, account.getBalance(), "Balance should remain unchanged for invalid withdrawal");
//    }
//
//    @Test
//    void testTransactionLogging() {
//        Customer customer = new Customer("Alice");
//        Account account = new Account(customer);
//
//        account.deposit(1000.0);
//        account.withdraw(300.0);
//        account.withdraw(1500.0); // Insufficient funds
//
//        List<String> expectedTransactions = List.of(
//            "Deposited: 1000.0",
//            "Withdrew: 300.0",
//            "Failed withdrawal: Insufficient funds for amount 1500.0"
//        );
//
//        assertEquals(expectedTransactions, account.getTransactionLog(), "Transactions should match expected log");
//    }
//
//    @Test
//    void testPrintStatement() {
//        Customer customer = new Customer("Alice");
//        Account account = new Account(customer);
//
//        account.deposit(500.0);
//        account.withdraw(200.0);
//
//        // Capture System.out output
//        ByteArrayOutputStream output = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(output));
//
//        account.printStatement();
//
//        String expectedOutput = """
//            Statement for Alice
//            Deposited: 500.0
//            Withdrew: 200.0
//            Balance: 300.0
//            """;
//
//        assertTrue(output.toString().trim().contains(expectedOutput.trim()), "Printed statement should match expected output");
//    }
//}