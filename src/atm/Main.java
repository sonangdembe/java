package atm;

import java.util.Scanner;

class ATM{
    double balance = 0.0;
    void checkBalance(){
        System.out.println("balance is "+balance);
    }
    void deposite(double depositeBalance){
        balance += depositeBalance;
        System.out.println("balance is "+balance);
    }
    void withdraw(double withdrawlBalance){
        if(withdrawlBalance <= balance){
            balance -= withdrawlBalance;
            System.out.println("Balance is " + balance);
        }else{
            System.out.println("insufficient funds");
        }

    }

}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     ATM myobj = new ATM();
        System.out.println("Enter the pin");
        int pin = sc.nextInt();
        int correctPin = 1234;
        if(pin == correctPin){
            System.out.println("pin is correct");



            System.out.println("Enter 1 to checkBalance");
            System.out.println("Enter 2 to deposit");
            System.out.println("Enter 3 to withdraw");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    myobj.checkBalance();
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw");
                    double amount = sc.nextDouble();
                    myobj.deposite(amount);
                    break;
                case 3:
                    System.out.println("Enter the amount you want to withdraw");
                    double amount2= sc.nextDouble();
                    myobj.withdraw(amount2);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
       else{
            System.out.println("pin is incorrect");
        }
    }
}
