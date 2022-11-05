package com.bank;

import java.util.ArrayList;

public class BankAccount {
    public String  fName;
    public String  lName;
    public int userId;
    public int accountNo;
    public String password;
    int  balance;
    int transation;
    int noOfTransation;
    ArrayList <Integer>  balanceList= new ArrayList<Integer>();
    ArrayList <Integer>  transationList= new ArrayList<Integer>();

    BankAccount b;
    private int index;
    public BankAccount(){}
    BankAccount(BankAccount obj){
        this.fName= obj.fName;
        this.lName= obj.lName;
        this.userId= obj.userId;
        this.password= obj.password;
        this.accountNo= obj.accountNo;
        this.balance=obj.balance;
        this.noOfTransation= obj.noOfTransation;
        this.transation= obj.transation;
        this.transationList=obj.transationList;
        this.balanceList=obj.balanceList;
    }
    void record (){
            balanceList.add(balance);
            transationList.add(transation);
            noOfTransation = balanceList.size();
    }
    void deposit(int amount){
        transation=amount;
        balance=balance+amount;
        record();
    }
    void withdrawn(int amount) {
        balance = balance - amount;
        if (balance>=0) {

            transation = -amount;
            record();
        }
        else {
            balance=balance+amount;
            System.out.println("you donot have enough balance");
        }
    }
    void getPossbook(){
        //System.out.println("===========================================================");
        System.out.println(" deposite \t\twithdrawn\t\tcurrent balance\t\t   Remark");
        System.out.println("===========================================================");
        int i;
        if(noOfTransation>0) {
            for (i = 0; i < noOfTransation; i++) {
                int element = transationList.get(i);
                if (element > 0) {
                    System.out.println("  " + element + "\t\t\t\t\t\t\t\t" + balanceList.get(i) + "\t\t\t\t credited");

                } else if (element < 0) {
                    System.out.println("\t\t\t\t" + element + "\t\t\t\t" + balanceList.get(i) + "\t\t\t\t debited");

                }
            }
        }
        else{
            System.out.println("No Tranasation");
            System.out.println("===========================================================");
        }
    }
    void personalDetail(){
        System.out.println("User name : "+fName+ " "+lName);
        System.out.println("User id : "+userId);
        System.out.println("Account No : "+accountNo);
    }
    BankAccount updateAccountRecord() {

        return this;
    }
}


