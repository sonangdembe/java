package numberGuessing;


import java.util.Scanner;
import java.util.Random;

class RanNum {
    int ranNum;


    public int getRanNum() {
        Random random = new Random();
        ranNum = random.nextInt(10) + 1;
        return ranNum;
    }

}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RanNum rn = new RanNum();
        int secretNumber = rn.getRanNum();
        while(true){

            System.out.println("Enter a number");
            int num = sc.nextInt();

            if (secretNumber == num) {
                System.out.println("You guessed the correct number");
break;
            }else if(secretNumber >= num){
                System.out.println("You guessed the smalll number");
            }else{
                System.out.println("You guessed the biggest number");
            }
        }
    }
}