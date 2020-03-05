package com.company;

public class Main {

    public static void main(String[] args) throws LimitExeption {

        BankAccout bankAccout = new BankAccout();
        bankAccout.deposit(10000);


        for (int i = 0;  ; i++) {


            try {
                bankAccout.withDraw(6000);
            } catch (LimitExeption l){
                System.out.println("na schete ostalos sredstv "+l.getRemainingAmount());
                System.out.println(l.getMessage());
                break;
            } finally {
                System.out.println("vozmite kartu");
            }

        }

     }

}

