package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(0, 0.00, "NoName", "NoEmail", "NoPhoneNumber");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return Math.floor(balance * 100) / 100;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount");
        } else {
            this.balance += amount;
            System.out.println("Deposit of " + amount + " was successful");
        }
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid deposit amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds in account");
        } else {
            this.balance -= amount;
            System.out.println("Withdraw of " + amount + " was successful");
        }
    }
}
