package com.bank;

import java.util.Scanner;
public class BankingMenu extends BankAccount {
    BankingMenu(BankAccount s){
        super(s);
    }
    void show() {
        char option = '\0';
        Scanner scn = new Scanner(System.in);

            System.out.println("welcome " + fName+" "+lName );
            System.out.println("Your ID is :" +userId);
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B. Withdraw");
            System.out.println("C. Deposit");
            System.out.println("D. Passbook");
            System.out.println("E. Account Detail");
            System.out.println("F. Logout");

            do {
                System.out.println("=====================================================");
                System.out.println("Enter the option (A-Balance,B-withdraw,C-Deposit,D-Passbook,E-Account Detail,F-Logout:");

                    option = scn.next().charAt(0);
                    System.out.println("\n");

                switch (option) {
                    case 'A':
                        System.out.println("======================================================");
                        System.out.println("Balance:  " + balance);
                        break;
                    case 'B':
                        System.out.println("======================================================");
                        System.out.println("Enter the amount to withdraw:");
                        int amount = scn.nextInt();
                        withdrawn(amount);
                        break;
                    case 'C':
                        System.out.println("======================================================");
                        System.out.println("Enter the amount to Deposit :");
                        int amount1 = scn.nextInt();
                        deposit(amount1);
                        break;

                    case 'D':
                        System.out.println("======================================================");
                        System.out.println("Your Passbook  is :");
                        getPossbook();
                        break;
                    case 'E':
                        System.out.println("======================================================");
                        personalDetail();
                        break;
                    case 'F':
                        System.out.println("******************************************************");
                        updateAccountRecord();
                        break;
                    default:
                        System.out.println("Invalid option.... Please try again");
                        break;
                }

            } while (option != 'F');
            System.out.println("Thank you have a great day");
    }
}

