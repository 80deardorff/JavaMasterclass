package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(12345);
//        account.setCustomerName("John Smith");
        account.setEmail("johnsmith@gmail.com");
        account.setPhoneNumber("1234567890");
        System.out.println("Account number: " + account.getAccountNumber());
        System.out.println("Account name: " + account.getCustomerName());
        System.out.println("Account email: " + account.getEmail());
        System.out.println("Account phone number: " + account.getPhoneNumber());
        account.setBalance(100.05);
        System.out.println("Account balance: " + account.getBalance());
        account.withdraw(200);
        account.deposit(-2);
        account.deposit(100);
        System.out.println("Account balance: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Account balance: " + account.getBalance());
    }
}
