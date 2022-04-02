package com.company;

public class Client {

    public static void main(String[] args) {

        Bank brd = new BankBranch();
        Bank atm = new ATM(brd);

        brd.transfer();
        brd.withdraw();
        atm.deposit();
        atm.changePersonalInfo();
        atm.transfer();
        brd.changePersonalInfo();
    }
}
