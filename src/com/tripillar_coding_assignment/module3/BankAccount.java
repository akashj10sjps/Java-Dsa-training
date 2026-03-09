package com.tripillar_coding_assignment.module3;

public class BankAccount {
    int AccountNumber;
    int balance;
    BankAccount(int AccountNumber,int balance){
        this.AccountNumber=AccountNumber;
        this.balance=balance;
    }
    void deposit(int deposit){
        this.balance=this.balance+deposit;
        System.out.println("Deposited amount  is:"+deposit);
        System.out.println("Total balance is :"+balance);
    }
    void withdraw(int withdraw){
        this.balance=this.balance-withdraw;
        System.out.println("Withdraw amount is :"+withdraw);
        System.out.println("total remaining is :"+balance);
    }
    void bankDetails() {
        System.out.println("Account number is:"+AccountNumber);
        System.out.println("balance is :"+balance);
    }

    public static void main(String[] args) {
        BankAccount Person= new BankAccount(1234567890,100000);
        Person.bankDetails();
        Person.deposit(20000);
        Person.withdraw(10000);
    }
}
