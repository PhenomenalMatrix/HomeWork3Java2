package com.company;

public class BankAccout {
    private static double amount;

    public BankAccout(){
    }


    public static double getAmount() {
        return amount;
    }


    public void deposit(double sum){
        if (sum > 0){
            amount = amount + sum;
            System.out.println("na schete " + amount);
        }
    }

    public void withDraw(int sum) throws LimitExeption{

        if (getAmount() < sum){
            throw new LimitExeption("Nedostatochno sredstv, na schete", getAmount());
        } else {
            System.out.println("snyato "+ sum);
            System.out.println("na schete ostalos sredstv "+ (amount =  getAmount() - sum));
        }




     /*  if (getAmount() > 0){
           System.out.println("snyato " + sum);
           System.out.println("ostatok " + (amount = amount - sum));
        if (getAmount() < sum){
            System.out.println("snyato " + amount);
            amount = amount - amount;
            System.out.println("na schete " + amount);
        }

       }
       else {

           throw new LimitExeption("Nedostatochno sredstv, na schete", getAmount());

       }*/
    }
}
