package com.neoteric.springbootdocker.overriding;

public class BankSystemTest {
    public static void main(String[] args) {
        try {
            SavingsAccount account = new SavingsAccount("John Doe", 5000000);
            System.out.println("Processing withdrawal from Savings Account for " + account.getAccountHolder() + "...");
            account.withdraw(4987868);
            SavingsAccount account1= new SavingsAccount("John Doe", 5000);
            System.out.println("Processing withdrawal from Savings Account for " + account.getAccountHolder() + "...");
            account.withdraw(4968);
        } catch (InsufficientFundsException e) {
            System.out.println("error:" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Account creation error: " + e.getMessage());

        }
    }
}