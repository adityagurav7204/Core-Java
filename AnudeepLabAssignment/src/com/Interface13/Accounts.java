package com.Interface13;

import java.util.ArrayList;
import java.util.Scanner;

// Interface
public interface Accounts {
    void deposit();
    void withdraw();    
    void calculateInterest();
    void viewBalance();
}

// Bank class
class Bank {
    ArrayList<Accounts> accountsList = new ArrayList<>();

    public void addAccount(Accounts acc) {
        accountsList.add(acc);
        System.out.println("Account added to bank.");
    }

    public void showAllBalances() {
        for (Accounts acc : accountsList) {
            acc.viewBalance();
        }
    }
}

// SavingAccounts class
class SavingAccounts implements Accounts {
    double balance = 0;
    Scanner sc = new Scanner(System.in);

    @Override
    public void deposit() {
        System.out.print("Enter amount to deposit in Savings Account: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in Savings Account.");
    }

    @Override
    public void withdraw() {
        System.out.print("Enter amount to withdraw from Savings Account: ");
        double amount = sc.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account.");
        } else {
            System.out.println("Not enough balance in Savings Account.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest ₹" + interest + " added to Savings Account.");
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account Balance: ₹" + balance);
    }
}

// CurrentAccount class
class CurrentAccount implements Accounts {
    double balance = 0;
    double overdraftLimit = 1000;
    Scanner sc = new Scanner(System.in);

    @Override
    public void deposit() {
        System.out.print("Enter amount to deposit in Current Account: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Deposited ₹" + amount + " in Current Account.");
    }

    @Override
    public void withdraw() {
        System.out.print("Enter amount to withdraw from Current Account: ");
        double amount = sc.nextDouble();
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Current Account.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for Current Account.");
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: ₹" + balance);
    }

    public void showOverdraftLimit() {
        System.out.println("Overdraft limit: ₹" + overdraftLimit);
    }
}