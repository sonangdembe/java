package timeConverte;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the time how many days");
        int time = sc.nextInt();

        while (true) {
            System.out.println("Enter 1 to change into min");
            System.out.println("Enter 2 to change into sec");
            System.out.println("Enter your choice");

            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    int minTime = time*24*60;
                    System.out.println("minTime:"+minTime);

                break;
                case 2:
                    int secTime = time*24*60* 60;
                    System.out.println("secTime:"+secTime);
                default:
                System.out.println("Invalid choice");
            }
        }
    }
}
