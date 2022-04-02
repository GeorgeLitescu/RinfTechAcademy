package com.company;

public class ATM implements Bank {
    private Bank relatedBranch;

    public ATM(Bank relatedBranch) {
        this.relatedBranch = relatedBranch;
    }

    public void withdraw() {
        System.out.println("**Checking pin**");
        relatedBranch.withdraw();
    }

    public void deposit() {
        System.out.println("**Checking pin**");
        relatedBranch.deposit();
    }

    @BankAnnotations(action = "Moves money from a to b")
    public void transfer() {
        System.out.println("**Checking pin**");
        relatedBranch.transfer();
    }

    public void changePersonalInfo() {
        System.out.println("This is not supported\nGo to bank!\n");
    }
}
