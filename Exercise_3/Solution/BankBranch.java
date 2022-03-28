package com.company;

public class BankBranch implements Bank {
    public void withdraw() {
        System.out.println("...Counting...\nWithdraw completed succesfully\n");
    }

    public void deposit() {
        System.out.println("...Counting...\nDeposit completed succesfully\n");
    }

    public void transfer() {
        System.out.println("...Counting...\nTransfer completed succesfully\n");
    }

    public void changePersonalInfo() {
        System.out.println("Personal information updated\n");
    }
}
