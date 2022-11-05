package com.bank;

import java.util.Scanner;
class NewUser extends Login {
    String FName;
    String LName;
    //String name=FName+" "+LName;
    static int accountNo;
    int uid;
    String pword;
    Scanner sc=new Scanner(System.in);
    NewUser(){
        System.out.println("Enter your first Name :");
        FName=sc.next();
        System.out.println("Enter your Last Name :");
        LName=sc.next();
        System.out.println("Thanks you \n"+FName+" "+LName);
        System.out.println("======================================================");
        accountNo=getAccountNo();
        System.out.println("Your Account Number is "+ accountNo);
        uid=randomUserId(6);
        System.out.println("Your User ID is "+ uid);
        pword =randomPassword(6);
        // pword="123";
        System.out.println("Your Password  is "+ pword);
        System.out.println("======================================================");

    }
    int getAccountNo(){
        return accountNo=accountNo+1;
    }
    private int randomUserId(int length){
        String uidSet="0123456789";
        char []uid=new char[length];
        for (int i=0;i<length;i++){
            int rand =(int)(Math.random()*uidSet.length());
            uid[i]=uidSet.charAt(rand);

        }

        return Integer.parseInt(new String(uid));
    }
    private String randomPassword(int length){
        String pSet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!$#";
        char []password=new char[length];
        for (int i=0;i<length;i++){
            int rand =(int)(Math.random()*pSet.length());
            password[i]=pSet.charAt(rand);
        }
        return new String(password);
    }

}
