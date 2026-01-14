package com.Interface13;

class AccMain {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccounts sa = new SavingAccounts();
        CurrentAccount ca = new CurrentAccount();

        bank.addAccount(sa);
        bank.addAccount(ca);

        sa.deposit();
        sa.calculateInterest();
        sa.withdraw();
        sa.viewBalance();

        System.out.println();

        ca.deposit();
        ca.withdraw();
        ca.calculateInterest();
        ca.viewBalance();
        ca.showOverdraftLimit();

        System.out.println("\n--- All Account Balances ---");
        bank.showAllBalances();
    }
}