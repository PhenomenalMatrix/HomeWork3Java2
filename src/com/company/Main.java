package com.company;

public class Main {

    public static void main(String[] args) throws LimitExeption {

        BankAccout bankAccout = new BankAccout();
        bankAccout.deposit(10000);


        for (int i = 0;  ; i++) {


            try {
                bankAccout.withDraw(6000);
            } catch (LimitExeption l){
                System.out.println(l.getMessage());
                break;
            }

        }

     }

}

