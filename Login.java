package com.bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public ArrayList<NewUser> userRecord = new ArrayList<NewUser>();
    ArrayList<BankAccount> Br = new ArrayList<BankAccount>();
     static int i=0;
     public void addNewUser() {
        NewUser nu = new NewUser();
        userRecord.add(nu);
       BankAccount ba =access(i);
       i=i+1;
       Br.add(ba);
    }
    void existingUser() {
        ExistingUser eu = new ExistingUser();
        int i=check(eu);
        if(i>=0){
        BankAccount ba=Br.get(i);
        BankingMenu mn=new BankingMenu(Br.get(i));
        mn.show();
        Br.set(i,mn.updateAccountRecord());

        }
        else {
            System.out.println("Account Does not exist");
            System.out.println("======================================================");

        }
    }
    BankAccount access(int i){
        NewUser nu=userRecord.get(i);
        BankAccount ba=new BankAccount();
        ba.fName=nu.FName;
        ba.lName=nu.LName;
        ba.userId=nu.uid;
        ba.accountNo=nu.accountNo;
        ba.password=nu.pword;
        return ba;
    }
    int  check(ExistingUser e) {
        int i = 0;
        while (i < userRecord.size()) {
            NewUser nu = userRecord.get(i);
            if ((nu.uid == e.uid) && (nu.pword.equals(e.pword))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    int  check(BankAccount e) {
        int i = 0;
        while (i < Br.size()) {
            BankAccount ba = Br.get(i);

            if ((ba.userId == e.userId) && (ba.password.equals(e.password))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Welcome to our Bank **********");
        int ch = 0;
        do {
            System.out.println("press  1 : for New User ");
            System.out.println("press  2 : for Existing User ");
            System.out.println("press -1 : for exit ");
            System.out.println("=====================================================");
           try{
               ch = Integer.parseInt(sc.next());
           }catch (NumberFormatException e){
               System.out.println(e.fillInStackTrace());
           }
            switch (ch) {
                case 1:
                    addNewUser();
                    break;

                case 2:
                    existingUser();
                    break;

                case -1:
                    System.out.println("**********Thanks you **********");
                    System.out.println("*******************************");

                    break;

                default:
                    System.out.println("Invalid Option");
            }

        } while (ch !=-1);
    }

    void addRecord(NewUser obj) {
        userRecord.add(obj);

    }
}
//=========================================================================


//=========================================================================
class ExistingUser extends Login{
    int uid;
    String pword;
    Scanner sc = new Scanner(System.in);
    ExistingUser() {
        System.out.println("Enter User ID : ");
       try {
           uid =Integer.parseInt(sc.next());
       }catch (Exception e){}
        System.out.println("Enter password : ");
        pword = sc.next();

    }

}

