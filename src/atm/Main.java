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
        int correctPin = 1234;
        int attempts = 0;
        boolean loggedIn = false;

        while (attempts < 3) {
            System.out.print("Enter PIN: ");
            int pin = sc.nextInt();

            if (pin == correctPin) {
                System.out.println("PIN is correct");
                loggedIn = true;
                break;
            } else {
                attempts++;
                System.out.println("Incorrect PIN");

                if (attempts < 3) {
                    System.out.println((3 - attempts) + " attempt(s) remaining");
                }
            }
        }

        if (!loggedIn) {
            System.out.println("Too many incorrect attempts. Access denied.");
            return;
        }
        while (true) {
            System.out.println("Enter 1 to checkBalance");
            System.out.println("Enter 2 to deposit");
            System.out.println("Enter 3 to withdraw");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            switch (choice) {
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
                    double amount2 = sc.nextDouble();
                    myobj.withdraw(amount2);
                    break;
                default:
                    System.out.println("Wrong choice");
            }

        }

    }
}
